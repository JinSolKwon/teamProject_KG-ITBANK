<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>워크스페이스 메인</title>
</head>
<body>
	<c:if test="${member != null}">
		<p>${member.id}님 환영합니다.</p>
		
		<a href="/dto/member/logout">로그아웃</a>
		<a href="/dto/space/spaceCreate"><button type="submit" >워크스페이스 생성</button></a>
	</c:if>
</body>
</html>