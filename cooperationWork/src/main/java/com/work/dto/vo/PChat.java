package com.work.dto.vo;

import java.sql.Date;

public class PChat {
	int pchatno;
	int pchatroommemberno;
	String content;
	String filename;
	int pchatroommemberreno;
	String recontent;
	Date createat;
	
	public int getPchatno() {
		return pchatno;
	}
	public void setPchatno(int pchatno) {
		this.pchatno = pchatno;
	}
	public int getPchatroommemberno() {
		return pchatroommemberno;
	}
	public void setPchatroommemberno(int pchatroommemberno) {
		this.pchatroommemberno = pchatroommemberno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getPchatroommemberreno() {
		return pchatroommemberreno;
	}
	public void setPchatroommemberreno(int pchatroommemberreno) {
		this.pchatroommemberreno = pchatroommemberreno;
	}
	public String getRecontent() {
		return recontent;
	}
	public void setRecontent(String recontent) {
		this.recontent = recontent;
	}
	public Date getCreateat() {
		return createat;
	}
	public void setCreateat(Date createat) {
		this.createat = createat;
	}
	
	@Override
	public String toString() {
		return "PChat [pchatno=" + pchatno + ", pchatroommemberno=" + pchatroommemberno + ", content=" + content
				+ ", filename=" + filename + ", pchatroommemberreno=" + pchatroommemberreno + ", recontent="
				+ recontent + ", createat=" + createat + "]";
	}
}
