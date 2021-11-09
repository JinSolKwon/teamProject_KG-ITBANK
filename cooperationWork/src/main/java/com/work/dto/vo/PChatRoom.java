package com.work.dto.vo;

public class PChatRoom {
	int pchatroomno;
	int spaceno;
	public int getPchatroomno() {
		return pchatroomno;
	}
	public void setPchatroomno(int pchatroomno) {
		this.pchatroomno = pchatroomno;
	}
	public int getSpaceno() {
		return spaceno;
	}
	public void setSpaceno(int spaceno) {
		this.spaceno = spaceno;
	}
	@Override
	public String toString() {
		return "PChatRoom [pchatroomno=" + pchatroomno + ", spaceno=" + spaceno + "]";
	}
	
	
}
