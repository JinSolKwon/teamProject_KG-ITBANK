package com.work.dto;

import java.sql.Timestamp;

public class CalendarVo {
	// MEMBER테이블
	private String id;
	private String name;
	// SPACE 테이블
	private String spaceName;
	private int managerNo;
	// SPACE_MEMBER 테이블
	private int memberNo;
	// F_CALLENDER_DETAIL
	private int fcDetailNo;
	private int spaceNo;
	private int spaceMemberNo;
	private String subject;
	private Timestamp eventStartDate;
	private Timestamp eventEndDate;
	private String content;
	
	public CalendarVo() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getFcDetailNo() {
		return fcDetailNo;
	}

	public void setFcDetailNo(int fcDetailNo) {
		this.fcDetailNo = fcDetailNo;
	}

	public int getSpaceNo() {
		return spaceNo;
	}

	public void setSpaceNo(int spaceNo) {
		this.spaceNo = spaceNo;
	}

	public int getSpaceMemberNo() {
		return spaceMemberNo;
	}

	public void setSpaceMemberNo(int spaceMemberNo) {
		this.spaceMemberNo = spaceMemberNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Timestamp getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Timestamp eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public Timestamp getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Timestamp eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "CalendarVo [id=" + id + ", name=" + name + ", spaceName=" + spaceName + ", managerNo=" + managerNo
				+ ", memberNo=" + memberNo + ", fcDetailNo=" + fcDetailNo + ", spaceNo=" + spaceNo + ", spaceMemberNo="
				+ spaceMemberNo + ", subject=" + subject + ", eventStartDate=" + eventStartDate + ", eventEndDate="
				+ eventEndDate + ", content=" + content + "]";
	}
	
}
