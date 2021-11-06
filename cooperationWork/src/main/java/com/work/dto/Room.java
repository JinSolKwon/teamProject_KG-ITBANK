package com.work.dto;

public class Room {
	int room_no;
	int space_no;
	String room_name;
	
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public int getSpace_no() {
		return space_no;
	}
	public void setSpace_no(int space_no) {
		this.space_no = space_no;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	
	@Override
	public String toString() {
		return "Room [room_no=" + room_no + ", space_no=" + space_no + ", room_name=" + room_name + "]";
	}
}
