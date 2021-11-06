package com.work.dto;

import java.sql.Date;

public class Member {
	int member_no;
	String id;
	String password;
	String name;
	String email;
	Date creat_at;
	Date delete_at;
	
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreat_at() {
		return creat_at;
	}
	public void setCreat_at(Date creat_at) {
		this.creat_at = creat_at;
	}
	public Date getDelete_at() {
		return delete_at;
	}
	public void setDelete_at(Date delete_at) {
		this.delete_at = delete_at;
	}
	
	@Override
	public String toString() {
		return "Member [member_no=" + member_no + ", id=" + id + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", creat_at=" + creat_at + ", delete_at=" + delete_at + "]";
	}
}
