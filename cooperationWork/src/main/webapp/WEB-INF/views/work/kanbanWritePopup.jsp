<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<script>
		// 자동으로 팝업 창이 닫히게 하는 함수
		function popupClose(form) {
			//form의 target을 부모창으로 설정함
			form.target = opener.name;
			
			form.submit();
			
			if (opener != null) {
				opener.insert = null;
				
				self.close();
			}
			self.close();
		}
	</script>
<head>
<meta charset="UTF-8">
<title>업무 추가</title>
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
	
	<h1>업무 추가</h1>
	<form name="writeform" action="<c:url value='/work/kanbanWrite'/>" method="POST" target="kanbanMain">
	<div>
		<table>
			<tr>
				<td>내용<td>&nbsp
				<input type="text" id="content" name="content" >
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
				<select name="charge" id="charge">
					<c:forEach var="nameList" items="${nameList}" >
					<option value="${nameList.name}">${nameList.name}</option>
					</c:forEach>
				</select>
			</tr>
		</table>
		<br>
		<input type="submit" id="btn" value="추가" onclick="window.close()">
		<input type="reset" id="btn" value="다시작성 " >
		<input type="button" id="btn" value="닫기" onclick="window.close()">		
	</div>
	</form>
</body>
</html>