package com.work.dto;

public class Space_Member {
	int space_member_no;
	int space_no;
	int member_no;
	
	public int getSpace_member_no() {
		return space_member_no;
	}
	public void setSpace_member_no(int space_member_no) {
		this.space_member_no = space_member_no;
	}
	public int getSpace_no() {
		return space_no;
	}
	public void setSpace_no(int space_no) {
		this.space_no = space_no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	
	@Override
	public String toString() {
		return "Space_Member [space_member_no=" + space_member_no + ", space_no=" + space_no + ", member_no="
				+ member_no + "]";
	}
}
