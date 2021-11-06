<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>칸반 내용 수정</title>
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
	<h1>칸반 내용 수정</h1>
	<form action="<c:url value='/work/kanbanUpdate/${kanban.kanbanDetailNo}'/>" method="POST" target="kanbanMain">
	<div>
		<table>
			<tr>
				<td>내용<td>&nbsp
				<input type="text" id="content" name="content" value="${kanban.content}">
			</tr>
			<tr>
				<td>상태<td>&nbsp
				<select name="status" id="status">
					<option value="ToDo">To Do</option>
					<option value="Progress">In progress</option>
					<option value="Done">Done</option>
				</select>
			</tr>
			<tr>
				<td>담당<td>&nbsp
				<select name="charge" id="charge" >
					<c:forEach var="nameList" items="${nameList}" >
						<c:choose>
							<c:when test="${kanban.charge eq nameList.name}">
								<option value="${nameList.name}" selected>${nameList.name}</option>
							</c:when>
							<c:otherwise>
								<option value="${nameList.name}">${nameList.name}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select>
			</tr>
		</table>
		<br>
		<input type="submit" id="btn" value="수정" onclick="window.close()">
		<input type="button" id="btn" value="이전" onclick="window.location='<c:url value="/work/kanbanDetailPopup/${kanban.kanbanDetailNo}"/>'">
		<input type="button" id="btn" value="닫기" onclick="window.close()">
	</div>
</form>		
	
</body>
</html>