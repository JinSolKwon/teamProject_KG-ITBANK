package com.work.dto;

import java.util.List;

public class InviteVO {
	private int inviteNo;
	private int spaceNo;
	private List<String> id;
	private int memberNo;
	MemberVO member;
	
	
	public InviteVO() {}
	
	public InviteVO(int inviteNo, int spaceNo, List<String> id, int memberNo) {
		super();
		this.inviteNo = inviteNo;
		this.spaceNo = spaceNo;
		this.id = id;
		this.memberNo = memberNo;
	}

	public int getInviteNo() {
		return inviteNo;
	}

	public void setInviteNo(int inviteNo) {
		this.inviteNo = inviteNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getSpaceNo() {
		return spaceNo;
	}

	public void setSpaceNo(int spaceNo) {
		this.spaceNo = spaceNo;
	}

	public List<String> getId() {
		return id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Invite [inviteNo=" + inviteNo + ", spaceNo=" + spaceNo + ", id=" + id + ", memberNo=" + memberNo + "]";
	}
	
	
}
