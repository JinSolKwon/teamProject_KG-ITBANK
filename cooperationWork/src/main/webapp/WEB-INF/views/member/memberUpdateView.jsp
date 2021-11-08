<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
	<meta name="viewport" content="width=device-width">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
    integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" type="text/css">
	<title>TASKWITH</title>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
	<script type="text/javascript">
		$(document).ready(function(){
			// 취소
			$(".cencle").on("click", function(){			
				location.href = "/";					    
			})	
			$("#logoutBtn").on("click", function(){
			location.href="logout";
			})
			$("#memberDeleteBtn").on("click", function(){
				location.href="memberDeleteView";
			})				
			$("#submit").on("click", function(){
				if($("#pw").val() !== $("#pw2").val()){
					alert("새 비밀번호가 서로 다릅니다.");
					$("#pw").val("").focus();
					$("#pw2").val("");
					return false;
				}else if($("#password").val()==""){
					alert("기존 비밀번호를 입력해주세요.");
					$("#password").focus();
					return false;
				}else if($("#pw").val()==""){
					alert("새 비밀번호를 입력해주세요.");
					$("#pw").focus();
					return false;
				}else if($("#pw2").val()==""){
					alert("새 비밀번호를 입력해주세요.");
					$("#pw2").focus();
					return false;
				}
				$.ajax({
					url : "/member/pwChk",
					type : "POST",
					dataType : "json",
					data : $("#updateForm").serializeArray(),
					success: function(data){			
						if(data==0){
							alert("기존 비밀번호가 틀렸습니다.");
							return;
						}else{
							if(confirm("회원 정보를 수정 하시겠습니까?")){
								$("#updateForm").submit();
							}					
						}
					}
				})		
			});	
		})
	</script>
	<body>
	  <%@ include file="../include/loginMenu.jsp" %>
		<div class="container-fluid p-5 text-center">
     	  <div class="card login-form border-0">
           <div class="card-body">
			  <form action="/member/memberUpdate" method="post" id="updateForm">
			  <table align="center">
			  	<tr>
				  <td><label class="control-label" for="id" style="font-size:25px;">아이디</label></td>
				  <td><input class="form-control" type="text" id="id" name="id" value="${member.id}" readonly="readonly" style="width:190px; height:25px;"/><br></td>
				</tr>
				<tr>
				  <td><label class="control-label" for="name" style="font-size:25px;">이름</label></td>
				  <td><input class="form-control" type="text" id="name" name="name" value="${member.name}" readonly="readonly" style="width:190px; height:25px;"/><br></td>
                </tr>
                <tr>
				  <td><label class="control-label" for="email" style="font-size:25px;">이메일</label></td>
				  <td><input class="form-control" type="text" id="email" name="email" value="${member.email}" readonly="readonly" style="width:190px; height:25px;"/><br></td>
				</tr>
				<tr>
				  <td><label class="control-label" for="password" style="font-size:25px;">이전 비밀번호</label></td>
				  <td><input class="form-control" type="password" id="password" name="password" style="width:190px; height:25px;"/><br></td>
				</tr>
				<tr>
				  <td><label class="control-label" for="pw" style="font-size:25px;">새 비밀번호</label></td>
				  <td><input class="form-control" type="password" id="pw" name="pw" style="width:190px; height:25px;"/><br></td>
                </tr>
                <tr>
				  <td><label class="control-label" for="pw2" style="font-size:25px;">새 비밀번호 확인</label></td>
				  <td><input class="form-control" type="password" id="pw2" name="pw2" style="width:190px; height:25px;"/><br></td>
				</tr>
			  </table>
			</form>		
			      <table align="center">
			      <tr>
			      <td>
					<button class="btn" name="back" value="back" type="button" th:text="back" style="width:80px"; onClick="document.location.href='<c:url value="/"/>'">이전</button>		
					<button class="btn" id="memberDeleteBtn" type="button" th:text="Regist" style="color:white; width:80px;">회원탈퇴</button>										
                    <button class="btn" id="submit" name="button" value="modify" type="button" th:text="modify" style="width:80px;">수정 완료</button>	
				  </td>
				  </tr>
				  </table>		
		    	</div>
       		 </div>
     	  </div>
	</body>
</html>