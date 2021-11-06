package com.work.dto;

import java.sql.Date;

public class GChat {
	int gchat_no;
	int room_no;
	int space_member_no;
	String content;
	String filename;
	int space_member_re_no;
	String re_content;
	Date create_at;
	
	public int getGchat_no() {
		return gchat_no;
	}
	public void setGchat_no(int gchat_no) {
		this.gchat_no = gchat_no;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public int getSpace_member_no() {
		return space_member_no;
	}
	public void setSpace_member_no(int space_member_no) {
		this.space_member_no = space_member_no;
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
	public int getSpace_member_re_no() {
		return space_member_re_no;
	}
	public void setSpace_member_re_no(int space_member_re_no) {
		this.space_member_re_no = space_member_re_no;
	}
	public String getRe_content() {
		return re_content;
	}
	public void setRe_content(String re_content) {
		this.re_content = re_content;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	
	@Override
	public String toString() {
		return "GChat [gchat_no=" + gchat_no + ", room_no=" + room_no + ", space_member_no=" + space_member_no
				+ ", content=" + content + ", filename=" + filename + ", space_member_re_no=" + space_member_re_no
				+ ", re_content=" + re_content + ", create_at=" + create_at + "]";
	}
}
