package com.work.dto;

public class InviteList {
	private String spaceName;
	private String name;
	
	public InviteList() {}
	
	public InviteList(String spaceName, String name) {
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
		return "InviteList [spaceName=" + spaceName + ", name=" + name + "]";
	}
	
}
