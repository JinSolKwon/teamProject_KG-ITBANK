<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Download Client</title>
<script type="text/javascript">
	var ws = null;
	function connector() {
		var url = "ws://192.168.0.33:8080/download.do";
		ws = new WebSocket(url);
		ws.binaryType = "arraybuffer";
		ws.onopen = function() {
			alert("연결 완료");
		};
		ws.onmessage = function(e) {
			// 파일은 ArrayBuffer 로 온다 
			// e.data 의 type 은 ArrayBuffer 이고 이것을 DataView 로 넘겨준다. 
			var dataView = new DataView(e.data);
			// DataView 를 넘겨줘서 Blob 형태로 만들고 
			var blob = new Blob([ dataView ]);
			// blob 를 파일로 저장한다. 
			saveFile(blob);
		};
		ws.onclose = function(e) {
			alert(e.msg);
		};
		ws.onerror = function(e) {
			alert(e.msg);
		}
	}
	function requestFile() {
		// 테스트용 파일을 다운로드 요청 
		// 대용량 파일은 테스트중 문제 발생(1gb 이상의 파일로 테스트 해봄) 
		// movie (2).zip 파일은 약 12mb 이므로 
		// 이미지파일들은 왠만하면 파일 업/다운로드 가능할거라 판단 
		ws.send("fileName:level.gif");
	}
	function saveFile(blob) {
		var link = document.createElement('a');
		link.href = window.URL.createObjectURL(blob);
		link.download = 'level.gif';
		link.click();
	};
	function addEvent() {
		document.getElementById("connect").addEventListener("click", connector,
				false);
		document.getElementById("send").addEventListener("click", requestFile,
				false);
	}
	window.addEventListener("load", addEvent, false);
</script>
</head>
<body>
	<input id="connect" type="button" value="connect">
	<input id="send" type="button" value="start download">
</body>
</html>




















