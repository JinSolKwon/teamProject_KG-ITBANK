<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!-- saved from url=(0038)http://localhost:8080/dto/member/login -->
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<script>
	setTimeout(function(){
	location.reload();
	},1000); // 1000밀리초 = 3초
</script>	
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link href="${pageContext.request.contextPath}/resources/css/space.css" rel="stylesheet" type="text/css">
<title>TASKWITH</title>
</head>
<body>
	<%@ include file="../include/spaceMenu.jsp"%>
		<img src="${pageContext.request.contextPath}/resources/images/pngegg.png" 
			style="float:right; width:500px; height:500px; margin-right:200px;margin-top:130px;">
	<div style="text-align: left; margin-left:100px; margin-top: 40px;">
		<h2>
			TASKWITH는 팀이 함께 대화하고 일할 수 있는 홈그라운드를 제공합니다.<br>
			<br> 새 워크스페이스를 만드시려면 아래 버튼을 클릭하세요.
		</h2>
	</div>
	<div style="display: flex;">
		<a href="#" class="btn2" type="button" th:text="Regist"
			style="text-align: center;">워크스페이스 생성</a>	
	</div>
	<div id="ble">
		<table class="spacelist">
			<thead>
				<tr>
					<th style="width: 450px;"> (이름) 님의 워크스페이스 목록</th>
					<th style="width: 100px;"></th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="scroll">
		<table class="spacelist">
			<tbody>
				<tr>
					<td style="width: 450px;">새 워크스페이스1(관리자 이름)</td>
					<td style="width: 100px;">입장 및 삭제</td>
				</tr>
				<tr>
					<td>제라툴 협업툴(관리자 이름)</td>
					<td>입장 및 삭제</td>
				</tr>
				<tr>
					<td>ZERATUL PROJECT(관리자 이름)</td>
					<td>입장 및 삭제</td>
				</tr>
				<tr>
					<td>캐리건 협업(관리자 이름)</td>
					<td>입장 및 삭제</td>
				</tr>
			</tbody>
		</table>
	</div>
<div id="ble" style="margin-top: 50px;">
		<table class="spacelist">
			<thead>
				<tr>
					<th style="width: 450px;">초대 목록</th>
					<th style="width: 100px;"></th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="scroll">
		<table class="spacelist">
			<tbody>
				<tr>
					<td style="width: 450px;">짐레이너 협업(관리자 이름)</td>
					<td style="width: 100px;">수락 및 거절</td>
				</tr>
				<tr>
					<td>A조 Project(관리자 이름)</td>
					<td>수락 및 거절</td>
				</tr>
				<tr>
					<td>모르는 프로젝트(관리자 이름)</td>
					<td>수락 및 거절</td>
				</tr>
				<tr>
					<td>화이팅 해봅시다(관리자 이름)</td>
					<td>수락 및 거절</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>