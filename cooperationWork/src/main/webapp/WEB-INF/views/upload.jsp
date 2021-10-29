<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload Client</title>

<script type="text/javascript">
	var ws = null;

	function connector() {

		var url = "ws://192.168.0.160:8080/upload.do";

		ws = new WebSocket(url);

		ws.binaryType = "arraybuffer";
		ws.onopen = function() {
			alert("연결 완료");
		};

		ws.onmessage = function(e) {
			alert(e.msg);
		};

		ws.onclose = function() {
			alert("연결 종료");
		};
		ws.onerror = function(e) {
			alert(e.msg);
		}
	}

	function sendFile() {
		var file = document.getElementById('file').files[0];
		ws.send('filename:' + file.name);
		alert('test');

		var reader = new FileReader();
		var rawData = new ArrayBuffer();

		reader.loadend = function() {

		}

		reader.onload = function(e) {
			rawData = e.target.result;
			ws.send(rawData);
			alert("파일 전송이 완료 되었습니다.")
			ws.send('end');
		}

		reader.readAsArrayBuffer(file);
	}

	function addEvent() {
		document.getElementById("connect").addEventListener("click", connector,
				false);
		document.getElementById("send").addEventListener("click", sendFile,
				false);
	}

	window.addEventListener("load", addEvent, false);
</script>

</head>
<body>

	<input id="file" type="file">
	<input id="connect" type="button" value="connect">
	<input id="send" type="button" value="send">

</body>
</html>