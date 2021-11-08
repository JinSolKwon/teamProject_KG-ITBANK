<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
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
			$("#submit").on("click", function(){
				if($("#password").val()==""){
					alert("비밀번호를 입력해주세요.");
					$("#password").focus();
					return false;
				}	
					$.ajax({
					url : "/member/pwChk",
					type : "POST",
					dataType : "json",
					data : $("#delForm").serializeArray(),
					success: function(data){			
						if(data==0){
							alert("비밀번호가 틀렸습니다.");
							return;
						}else{
							if(confirm("정말 회원탈퇴를 하시겠습니까?")){
								$("#delForm").submit();
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
			<form action="/member/memberDelete" method="post" id="delForm">
			 <table align="center">
			   <tr>
				<td><label class="control-label" for="id" style="font-size:25px;">아이디</label></td>
				<td><input class="form-control" type="text" id="id" name="id" value="${member.id}" readonly="readonly" style="width:190px; height:25px;"/><br></td>
			   </tr>
			   <tr>
				<td><label class="control-label" for="name" style="font-size:25px;">성명</label></td>
				<td><input class="form-control" type="text" id="name" name="name" value="${member.name}" readonly="readonly" style="width:190px; height:25px;"/><br></td>
               </tr>
               <tr>        
				 <td><label class="control-label" for="password" style="font-size:25px;">패스워드</label></td>
				 <td><input class="form-control" type="password" id="password" name="password" style="width:190px; height:25px;"/><br></td>
			   </tr>
			  </table>
			</form>
				<button class="btn" id="submit" name="button" value="delete" type="button" th:text="delete" style="width:90px;">회원 탈퇴</button>	
				<button class="btn" name="back" value="back" type="button" th:text="back" style="width:80px"; onClick="document.location.href='<c:url value="memberUpdateView"/>'">취소</button>	
		  </div>
        </div>
      </div>
	</body>
</html>