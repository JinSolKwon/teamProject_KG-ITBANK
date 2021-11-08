<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
		})
</script>
<body>
<%@ include file="../include/loginMenu.jsp" %>
		<div class="container-fluid p-5 text-center">
     	  <div class="card login-form border-0">
           <div class="card-body">
			<form method="post" class="form-signin" action="/member/findPw" name="findform">
			<table align="center">
			   <tr>	
				<td><label for="id" style="font-size:25px;">아이디</label></td>
				<td><input type="text" id="id" name="id" class="form-control" style="width:190px; height:25px;"/><br></td>
			   </tr>	
			   <tr>		   
				<td><label for="email" style="font-size:25px;">이메일</label></td>
				<td><input type="text" id="email" name="email" class="form-control" style="width:190px; height:25px;"/><br></td>
			   </tr>
			</table>
			<br>
			<button class="btn" name="back" value="back" type="button" th:text="back" onClick="document.location.href='<c:url value="/"/>'">이전</button>
			<button id="submit" class="btn" name="Submit" value="비밀번호 찾기" type="submit" th:text="register">비번 찾기</button>
		<c:if test="${check == 1}">
			<script>
				opener.document.findform.id.value = "";
				opener.document.findform.email.value = "";
			</script><br><br>
			<label>일치하는 정보가 존재하지 않습니다.</label>
		</c:if>
	</form>
</body>
</html>