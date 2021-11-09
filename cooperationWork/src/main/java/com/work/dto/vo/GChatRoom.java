package com.work.dto.vo;

public class GChatRoom {
	int gchatroomno;
	int spaceno;
	String roomname;
	public int getGchatroomno() {
		return gchatroomno;
	}
	public void setGchatroomno(int gchatroomno) {
		this.gchatroomno = gchatroomno;
	}
	public int getSpaceno() {
		return spaceno;
	}
	public void setSpaceno(int spaceno) {
		this.spaceno = spaceno;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	@Override
	public String toString() {
		return "GChatRoom [gchatroomno=" + gchatroomno + ", spaceno=" + spaceno + ", roomname=" + roomname + "]";
	}
	
}
