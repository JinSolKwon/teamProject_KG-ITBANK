package com.work.dto;

import java.sql.Date;

public class Room_Member {
	int room_member_no;
	int room_no;
	int space_member_no;
	Date in_time;
	Date out_time;
	
	public int getRoom_member_no() {
		return room_member_no;
	}
	public void setRoom_member_no(int room_member_no) {
		this.room_member_no = room_member_no;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public int getSpace_member_no() {
		return space_member_no;
	}
	public void setSpace_member_no(int space_member_no) {
		this.space_member_no = space_member_no;
	}
	public Date getIn_time() {
		return in_time;
	}
	public void setIn_time(Date in_time) {
		this.in_time = in_time;
	}
	public Date getOut_time() {
		return out_time;
	}
	public void setOut_time(Date out_time) {
		this.out_time = out_time;
	}
	
	@Override
	public String toString() {
		return "Room_Member [room_member_no=" + room_member_no + ", room_no=" + room_no + ", space_member_no="
				+ space_member_no + ", in_time=" + in_time + ", out_time=" + out_time + "]";
	}
}
