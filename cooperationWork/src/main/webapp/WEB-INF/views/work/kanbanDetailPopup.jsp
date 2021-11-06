<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>칸반 상세</title>
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
		font-size:80%;
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
		padding-left:25%;
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
	<h1>칸반 상세내용</h1>
	<div>
		<table>
			<tr>
				<td>내용</td>
				<td>${kanban.content}</td>
			</tr>
			<tr>
				<td>담당자</td>
				<td>${kanban.charge}</td>
			</tr>
			<tr>
				<td>상태</td>
				<c:if test="${kanban.status == 'ToDo'}">
				<td>To Do</td>
				</c:if>
				<c:if test="${kanban.status == 'Progress'}">
				<td>In Progress</td>
				</c:if>
				<c:if test="${kanban.status == 'Done'}">
				<td>Done</td>
				</c:if>
			</tr>
		</table>
		<br>
		<input type="button" id="btn" value="수정" onclick="window.location='<c:url value="/work/kanbanUpdate/${kanban.kanbanDetailNo}"/>'">
		<input type="button" id="btn" value="삭제" onclick="window.location='<c:url value="/work/kanbanDelete/${kanban.kanbanDetailNo}"/>'">
		<input type="button" id="btn" value="닫기" onclick="window.close()">		
	</div>
	
</body>
</html>