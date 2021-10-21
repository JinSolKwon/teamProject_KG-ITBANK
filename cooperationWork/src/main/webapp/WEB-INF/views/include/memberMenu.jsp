<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<header class="shadow">
  <a href="${pageContext.request.contextPath}/member/login">
	<img src="${pageContext.request.contextPath}/resources/images/left-top.png"
	style="height:50px;width:250px;">
  </a>
  <nav>
    <a class="login1" href="${pageContext.request.contextPath}/member/login">로그인</a>
    <a class="login2" href="${pageContext.request.contextPath}/regist">회원가입</a>
  </nav>
</header>

<div class="footer">
<h4>Copyright(C) 2021 TASKWITH  All rights reserved.</h4>
</div>
</body>
</html>