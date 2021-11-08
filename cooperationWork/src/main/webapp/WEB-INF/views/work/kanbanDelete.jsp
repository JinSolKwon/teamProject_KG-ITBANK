<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>칸반 내용 삭제</title>
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
		padding-left:10%;
		padding-right:10%;
	}
	th,td{
		height:50px;
	}
</style>
</head>
<body>
	<h1>칸반 내용 삭제</h1>
	<div>
		<form action="<c:url value='/work/kanbanDelete/${kanban.kanbanDetailNo}'/>" method="POST">
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
			<tr>
				<td colspan="2" style="text-align: center;">
					<label style="font-size: 120%">삭제하시려면 해당 계정의 패스워드를 입력 후 삭제를	클릭하세요.</label><br>
					<c:if test="${param.msg != null || param.msg != ''}">
						<label>${param.msg}</label>
					</c:if>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input	type="password" id="pwd" name="pwd"	style="font-size: 80%; height: 20px; width: 100px;">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" id="btn" value="삭제" style="margin-left:35px;">
					<input type="button" id="btn" value="이전" onclick="window.location='<c:url value="/work/kanbanDetailPopup/${kanban.kanbanDetailNo}"/>'">
					<input type="button" id="btn" value="닫기" onclick="window.close()">			 
				</td>
			</tr>
		</table>
		
		</form>
	</div>
	
</body>
</html>