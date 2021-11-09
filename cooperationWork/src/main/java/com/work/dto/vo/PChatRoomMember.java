package com.work.dto.vo;

import java.sql.Date;

public class PChatRoomMember {
	int pchatroommemberno;
	int pchatroomno;
	int spacememberno;
	Date intime;
	Date outtime;
	
	public int getPchatroommemberno() {
		return pchatroommemberno;
	}
	public void setPchatroommemberno(int pchatroommemberno) {
		this.pchatroommemberno = pchatroommemberno;
	}
	public int getPchatroomno() {
		return pchatroomno;
	}
	public void setPchatroomno(int pchatroomno) {
		this.pchatroomno = pchatroomno;
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
		return "PChatRoomMember [pchatroommemberno=" + pchatroommemberno + ", pchatroomno=" + pchatroomno
				+ ", spacememberno=" + spacememberno + ", intime=" + intime + ", outtime=" + outtime + "]";
	}
}
