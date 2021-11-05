<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<c:if test="${member == null}">
	<form role="form" method="post" autocomplete="off" action="/dto/member/login">
		<p>
			<label for="id">아이디</label>
			<input type="text" id="id" name="id" />
		</p>
		<p>
			<label for="password">패스워드</label>
			<input type="password" id="password" name="password" />
		</p>
		<p><a href="/dto/member/login"><button type="submit">로그인</button></a></p>
		<p><a href="/dto/member/register">회원가입</a></p>
	</form>
	</c:if>
	
	<c:if test="${msg == false}">
		<p style="color:#f00;">틀렸어</p>
	</c:if>
	
	
	
</body>
</html>