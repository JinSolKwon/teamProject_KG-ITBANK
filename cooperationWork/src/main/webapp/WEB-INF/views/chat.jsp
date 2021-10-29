<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Chat</title>
</head>
<body>
    <div>
        <button type="button" onclick="openSocket();">대화방 참여</button>
        <button type="button" onclick="closeSocket();">대회방 나가기</button>
        <button type="button" onclick="javascript:clearText();">대화내용 지우기</button>
    	<br/><br/><br/>
  		메세지 입력 : 
        <input type="text" id="sender" value="${sessionScope.id}" style="display: none;">
        <input type="text" id="messageinput">
        <button type="button" onclick="send();">메세지 전송</button>
        
        <br/></br></br>
        
        
<a href="${pageContext.request.contextPath}/upload" ><button type="button" class="navyBtn">업로드</button></a>
<a href="${pageContext.request.contextPath}/download" ><button type="button" class="navyBtn">다운로드</button></a>
        
    </div>
    <!-- Server responses get written here -->
    <div id="messages">
    </div>
    <!-- websocket javascript -->
    <script type="text/javascript">
        var ws;
        var messages = document.getElementById("messages");
        
        function openSocket(){
            if(ws !== undefined && ws.readyState !== WebSocket.CLOSED ){
                writeResponse("WebSocket is already opened.");
                return;
            }
            //웹소켓 객체 만드는 코드
			ws = new WebSocket("ws://192.168.0.160:8080/echo.do");
            
            ws.onopen = function(event){
                if(event.data === undefined){
              		return;
                }
                writeResponse(event.data);
            };
            
            ws.onmessage = function(event){
                console.log('writeResponse');
                console.log(event.data)
                writeResponse(event.data);
            };
            
            ws.onclose = function(event){
                writeResponse("대화 종료");
            }
            
        }
        
        function send(){
           // var text=document.getElementById("messageinput").value+","+document.getElementById("sender").value;
            var text = document.getElementById("messageinput").value+","+document.getElementById("sender").value;
            ws.send(text);
            text = "";
        }
        
        function closeSocket(){
            ws.close();
        }
        
        function writeResponse(text){
            messages.innerHTML += "<br/>"+text;
        }

        function clearText(){
            console.log(messages.parentNode);
            messages.parentNode.removeChild(messages)
      	}
        
        
        
        function sendFile(){
        	ws.binaryType="arraybuffer";
        	
        	ws.onmessage = function(e){
                alert(e.msg);
            };
            
			ws.onerror = function(e) {
				alert(e.msg);
			}
	
            var file = document.getElementById('file').files[0];
            ws.send('#filename:'+file.name);
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
        
        function addEvent(){
  
            document.getElementById("FileSend").addEventListener("click", sendFile, false);
        }
        
        window.addEventListener("load", addEvent, false);
        
  </script>
</body>
</html>