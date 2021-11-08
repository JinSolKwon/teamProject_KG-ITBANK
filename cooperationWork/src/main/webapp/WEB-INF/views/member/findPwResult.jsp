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
			$("#registerBtn").on("click", function(){
				location.href="member/register";
			})
			
		})
</script>
	<body>		
		<%@ include file="../include/loginMenu.jsp" %>
			<div class="container-fluid p-5 text-center">
     		  <div class="card login-form border-0">
          		 <div class="card-body">
					<label>회원님의 비밀번호는 "${password}" 입니다.</label>
					<button class="btn" name="back" value="back" type="button" th:text="back" onClick="document.location.href='<c:url value="/"/>'">로그인 하기</button>
				</div>
        	 </div>
       	   </div>
	</body>
</html>