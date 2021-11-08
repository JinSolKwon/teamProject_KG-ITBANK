<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>칸반 내용 삭제 완료</title>
<style>

	@font-face {
      src : url("${pageContext.request.contextPath}/resources/font/BMJUA_ttf.ttf");
      font-family: "jua";
	}
	
	body{
	  font-family: 'jua';
	  background: #E4E9F7;
	}

	#btn{
		width:60px;
		height:30px;
		font-size:100%;
		border-radius:10px;
		font-family: 'jua';
		text-align: center;
	}
	h1 {
		text-align:center;
		font-family: 'jua';
		margin-top: 50px;
	}
	#content {
		height:20px;
		width: 150px;
		font-family: 'jua';
	}
	table{
		font-family: 'jua';
	}
	
	div{
		float:center;
		padding-left:40%;
	}
	th,td{
		height:50px;
	}
	#status, #charge{
		height:20px;
		width:100px;
	}
</style>
</head>
<body>
	<br><br><br><br>
	<h1>내용 삭제가 완료되었습니다.</h1>
	<div>
		<form method="POST" action="<c:url value='/work/kanbanDeleteAc'/>" target="kanbanMain">
			<input type="submit" id="btn" value="닫기" onclick="window.close()">
		</form>
	</div>
	
</body>
</html>