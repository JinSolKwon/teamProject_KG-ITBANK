package com.work.dto;

public class MemberVO {

	private int memberNo;
	private String id;
	private String password;
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
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
	
	public MemberVO() {}
	
	public MemberVO(int memberNo, String id, String password) {
		super();
		this.memberNo = memberNo;
		this.id = id;
		this.password = password;
	}
	@Override
	public String toString() {
		return "MemberVO [memberNo=" + memberNo + ", id=" + id + ", password=" + password + "]";
	}
}
