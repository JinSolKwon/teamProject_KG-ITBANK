package com.work.dto.vo;

import java.sql.Date;

public class GChatRoomMember {
	int gchatroommemberno;
	int gchatroomno;
	int spacememberno;
	Date intime;
	Date outtime;
	public int getGchatroommemberno() {
		return gchatroommemberno;
	}
	public void setGchatroommemberno(int gchatroommemberno) {
		this.gchatroommemberno = gchatroommemberno;
	}
	public int getGchatroomno() {
		return gchatroomno;
	}
	public void setGchatroomno(int gchatroomno) {
		this.gchatroomno = gchatroomno;
	}
	public int getSpacememberno() {
		return spacememberno;
	}
	public void setSpacememberno(int spacememberno) {
		this.spacememberno = spacememberno;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
	@Override
	public String toString() {
		return "GChatRoomMember [gchatroommemberno=" + gchatroommemberno + ", gchatroomno=" + gchatroomno
				+ ", spacememberno=" + spacememberno + ", intime=" + intime + ", outtime=" + outtime + "]";
	}
	
	
}
