package com.work.dto;

public class SpaceMemberVO {
	
	private int spaceMemberNo;
	private int spaceNo;
	private int memberNo;
	
	public SpaceMemberVO() {}
	
	public SpaceMemberVO(int spaceMemberNo, int spaceNo, int memberNo) {
		super();
		this.spaceMemberNo = spaceMemberNo;
		this.spaceNo = spaceNo;
		this.memberNo = memberNo;
	}

	public int getSpaceMemberNo() {
		return spaceMemberNo;
	}

	public void setSpaceMemberNo(int spaceMemberNo) {
		this.spaceMemberNo = spaceMemberNo;
	}

	public int getSpaceNo() {
		return spaceNo;
	}

	public void setSpaceNo(int spaceNo) {
		this.spaceNo = spaceNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	@Override
	public String toString() {
		return "SpaceMemberVO [spaceMemberNo=" + spaceMemberNo + ", spaceNo=" + spaceNo + ", memberNo=" + memberNo
				+ "]";
	}
	
	
	
}
