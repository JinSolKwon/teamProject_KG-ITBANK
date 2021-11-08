<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일정 목록</title>
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
	}
	th,td{
		height:50px;
	}
	.group-body{
		padding-left:40%;
	}
	.ui-datepicker{ 
		width: 150px;
		margin-right:40%;
		margin-top: 10%;
	}
		
	a:link { color: black; text-decoration: none;}
 	a:visited { color: black; text-decoration: none;}
 	a:hover { color: black; text-decoration: none;}
	
	table{
		margin-left: 30%;
		border:1px solid;
	}
	td,tr,th{
		border:1px solid;
	}
</style>
</head>
<body>
	<h1>스케쥴 목록</h1>
	<table>
				<thead>
					<tr id="tr">
						<th style="width: 100px;">일정</th>
						<th style="width: 100px;">시작날짜</th>
						<th style="width: 100px;">마감날짜</th>
					</tr>
				</thead>
				<tbody>
				 	<c:forEach var="schedule" items="${schedule}">
					<tr>
						<td>
							<a href="<c:url value="calendarDetail/${schedule.fcDetailNo}"/>" style="">
								${schedule.subject}  
							</a>	
						</td>
						<td>
							${schedule.eventStartDate}
						</td>
						<td>
							${schedule.eventEndDate}
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		<input type="button" style="width: 80px; height: 40px; font-size: 80%; border-radius: 10px; margin-left: 45%; margin-top: 20px;" 
		value="닫기" onClick="window.close()">
</body>
</html>