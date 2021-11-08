<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<header class="shadow">

  <a href="${pageContext.request.contextPath}/">
	<img src="${pageContext.request.contextPath}/resources/images/leftTop.png"
	style="height:50px;width:250px;margin-top:3px;">
  </a>
  <nav>
  	<c:if test="${member == null }">
    <a class="login1" href="${pageContext.request.contextPath}/">로그인</a>
    </c:if>
    <c:if test="${member != null }">
    <a class="login2" href="${pageContext.request.contextPath}/member/logout">로그아웃</a>
    </c:if>
    <c:if test="${member != null }">
    <a class="login3" href="${pageContext.request.contextPath}/member/memberUpdateView">회원정보 수정</a>
    </c:if>
    <c:if test="${member == null }">
    <a class="login4" href="${pageContext.request.contextPath}/member/register">회원가입</a>
    </c:if>
  </nav>
</header>

<div class="footer">
<h4>Copyright(C) 2021 TASKWITH  All rights reserved.</h4>
</div>
</body>
</html>