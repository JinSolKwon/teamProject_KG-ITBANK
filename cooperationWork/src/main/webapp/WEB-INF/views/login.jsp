<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<title>Home</title>
</head>
<div class="panel-title">환영합니다!</div>
<form id="login-form" method="post" action="/loginProcess.do">
	<div>
		<input type="text" name="id" class="form-control" name="아이디 입력"
			placeholder="Username" autofocus>
	</div>
	<div>
		<button type="submit" class="form-control btn btn-primary">로그인</button>
	</div>
</form>
</html>