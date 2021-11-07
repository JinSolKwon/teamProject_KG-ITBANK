<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일정 추가</title>
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
</style>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<!-- datepicker -->
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<!-- custom -->
<link href="resources/custom/css/schedule.css" rel="stylesheet" />	
<script src="resources/custom/js/schedule.js" type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/resources/css/calendar/schedule.js"></script>
</head>
<body>
<div class = "group" id = "popupGroup">	
	<div class = "group-head">
		<h1 class = "zTree-h1"> 일정 추가 </h1>
	</div>
	<div class = "group-body">
	<form id = "scheduleData">
		<div class = "top">
			<input class = "subject" id = "subject" type = "text" name = "subject" placeholder="제목을 입력해주세요">
		</div>
		<div class = "domain">
			<h3 class = "zTree-h3"> 시작 </h3>
		</div>
		<div class = "domain">
			<input class = "date" id = "startDate" type = "text" name = "startDate" id = "startDate">
		</div>
		<div class = "domain">
			<h3 class = "zTree-h3"> 종료 </h3>
		</div>
		<div class = "domain">
			<input class = "date" id = "endDate" type = "text" name = "endDate" id = "endDate">
		</div>
		<div class = "domain">
			<h3 class = "zTree-h3"> 메모 </h3>
		</div>
		<div class = "domain">
			<textarea class = "memo" id = "memo" name = "memo" rows = "5" cols = "20" placeholder="100글자까지 입력 가능합니다"></textarea> 
		</div>
	</form>
		<button class = "ok-button" type= "button" onclick="click_ok();">확인</button>
	</div>	
</div>
</body>
</html>