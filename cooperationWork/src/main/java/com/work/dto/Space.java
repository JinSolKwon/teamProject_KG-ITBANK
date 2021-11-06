package com.work.dto;

public class Space {
	int space_no;
	String space_name;
	int manager_no;
	
	public int getSpace_no() {
		return space_no;
	}
	public void setSpace_no(int space_no) {
		this.space_no = space_no;
	}
	public String getSpace_name() {
		return space_name;
	}
	public void setSpace_name(String space_name) {
		this.space_name = space_name;
	}
	public int getManager_no() {
		return manager_no;
	}
	public void setManager_no(int manager_no) {
		this.manager_no = manager_no;
	}
	
	@Override
	public String toString() {
		return "Space [space_no=" + space_no + ", space_name=" + space_name + ", manager_no=" + manager_no + "]";
	}
}
