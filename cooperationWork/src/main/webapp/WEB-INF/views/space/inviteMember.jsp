<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 초대</title>

<script type="text/javascript">
	function addRow(){
		var sTable = document.getElementById("sTable");
		//테이블 마지막에 row추가
		var lastRow = sTable.rows.length;
		var iteration = lastRow;
		var row = sTable.insertRow(lastRow);
		
		//text를 추가
		var count = row.insertCell(0);
		var textNode = document.createTextNode(iteration);
		count.appendChild(textNode);
		
		//input 을 추가
		var addId = row.insertCell(1);
		var idEl = document.createElement('input');
		idEl.type = "text";
		idEl.name = "id";
		idEl.id = "id";
		idEl.size="12";
		addId.appendChild(idEl);
		
		//button 추가
		var removeBtn = row.insertCell(4);
		var removeBtnEl = document.createElement('input');
		removeBtnEl.type = "button";
		removeBtnEl.name = "removeButton";
		removeBtnEl.id = "removeButton";
		removeBtnEl.value = "삭제";
		removeBtn.appendChild(removeBtnEl);
	}
	function delRow(){
		var sTable = document.getElementById("sTable");
		var lastRow = sTable.rows.length-1;
		
		if(lastRow > 0) sTable.deleteRow(lastRow);
	}
	
</script>
</head>
<body>
	<form id="sForm" method="post" action="/dto/space/inviteMember">
		<table id="sTable">
			<tr>
				<td><input type="text" placeholder="아이디 입력" id="id" name="id"></td>
				<td><a href="/dto/member/login"><button type="submit" >확인</button></a></td>
			</tr>
			
		</table>
		<input type="button" name="adding" value="추가" onclick="addRow()">
		<input type="button" name="delete" value="삭제" onclick="delRow()">
	</form>
	 <p>
  	<a href="/dto/member/login">처음으로</a>
	 </p>
</body>
</html>