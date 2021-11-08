<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<header class="shadow"> 
  <a href="${pageContext.request.contextPath}/space/space">
	<img src="${pageContext.request.contextPath}/resources/images/leftTop.png"
	style="height:50px;width:250px;margin-top:3px;">
  </a>
  <nav>
    <a class="login1" href="/dto/member/logout">로그아웃</a>
    <a class="login2" href="${pageContext.request.contextPath}/#">회원정보 변경</a>
  </nav>
</header>

<div class="footer">
<h4>Copyright(C) 2021 TASKWITH  All rights reserved.</h4>
</div>
</body>
</html>