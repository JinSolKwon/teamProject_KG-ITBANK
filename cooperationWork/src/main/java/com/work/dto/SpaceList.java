package com.work.dto;

public class SpaceList {
	private String spaceName;
	private String name;
	
	public SpaceList() {}
	
	public SpaceList(String spaceName, String name) {
		super();
		this.spaceName = spaceName;
		this.name = name;
	}
	public String getSpaceName() {
		return spaceName;
	}
	public void setSpaceName(String spaceName) {
		this.spaceName = spaceName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "spaceList [spaceName=" + spaceName + ", name=" + name + "]";
	}
	
	
	
}
