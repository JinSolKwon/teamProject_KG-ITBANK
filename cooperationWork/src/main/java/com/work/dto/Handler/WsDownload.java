package com.work.dto.Handler;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/download.do")
public class WsDownload {
	String path = "C:\\test\\websocket\\";

	// 메세지를 받으면 호출된다. 
	@OnMessage
	public void onMessage(Session session, String msg) throws IOException {
		// 클라이언트에서 fileName:파일명 형태로 파일 요청 
		String fileName = msg.substring(msg.indexOf(":") + 1);
		System.out.println("request file : " + fileName);
		// 파일 객체 생성 
		File file = new File(path + fileName);
		// 파일을 담을 바이트 배열 
		byte[] fileBytes = new byte[(int) file.length()];
		try (
				// 파일로 연결된 스트림 생성 
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
			// 바이트 배열에 파일 저장 
			bis.read(fileBytes);
		}
		// ByteBuffer에 바이트 배열을 담는다 
		ByteBuffer buf = ByteBuffer.wrap(fileBytes);
		// ByteBuffer 를 클라이언트로 보낸다. 
		session.getBasicRemote().sendBinary(buf);
	}

	@OnOpen
	public void open(Session session) {
		System.out.println("WebSocket File Server Open......");
	}

	@OnError
	public void error(Session session, Throwable t) {
		System.out.println("error.......");
	}

	@OnClose
	public void closedConnection(Session session) {
		System.out.println("연결종료........");
	}
}
