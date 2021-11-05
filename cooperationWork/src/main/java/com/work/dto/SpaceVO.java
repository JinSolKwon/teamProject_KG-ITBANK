package com.work.dto;

public class SpaceVO {
	
	private int spaceNo;
	private String spaceName;
	private int managerNo;
	
	public SpaceVO() {}
	
	public SpaceVO(int spaceNo, String spaceName, int managerNo) {
		super();
		this.spaceNo = spaceNo;
		this.spaceName = spaceName;
		this.managerNo = managerNo;
	}
	public int getSpaceNo() {
		return spaceNo;
	}
	public void setSpaceNo(int spaceNo) {
		this.spaceNo = spaceNo;
	}
	public String getSpaceName() {
		return spaceName;
	}
	public void setSpaceName(String spaceName) {
		this.spaceName = spaceName;
	}
	public int getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(int managerNo) {
		this.managerNo = managerNo;
	}

	@Override
	public String toString() {
		return "SpaceVo [spaceNo=" + spaceNo + ", spaceName=" + spaceName + ", managerNo=" + managerNo + "]";
	}
	
	
}
