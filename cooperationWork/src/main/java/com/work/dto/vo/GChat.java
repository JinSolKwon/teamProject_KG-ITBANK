package com.work.dto.vo;

import java.sql.Date;

public class GChat {
	int gchatno;
	int gchatroommemberno;
	String content;
	String filename;
	int gchatroommemberreno;
	String recontent;
	Date createat;
	public int getGchatno() {
		return gchatno;
	}
	public void setGchatno(int gchatno) {
		this.gchatno = gchatno;
	}
	public int getGchatroommemberno() {
		return gchatroommemberno;
	}
	public void setGchatroommemberno(int gchatroommemberno) {
		this.gchatroommemberno = gchatroommemberno;
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
	public int getGchatroommemberreno() {
		return gchatroommemberreno;
	}
	public void setGchatroommemberreno(int gchatroommemberreno) {
		this.gchatroommemberreno = gchatroommemberreno;
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
		return "GChat [gchatno=" + gchatno + ", gchatroommemberno=" + gchatroommemberno + ", content=" + content
				+ ", filename=" + filename + ", gchatroommemberreno=" + gchatroommemberreno + ", recontent=" + recontent
				+ ", createat=" + createat + "]";
	}
	
}
