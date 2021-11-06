package com.work.dto;

import java.sql.Timestamp;

public class KanbanVo {
	// MEMBER테이블
	private String id;
	private String name;
	// SPACE 테이블
	private String spaceName;
	private int managerNo;
	// SPACE_MEMBER 테이블
	private int memberNo;
	// KANBAN_DETAIL
	private int kanbanDetailNo;
	private int spaceNo;
	private int spaceMemberNo;
	private String content;
	private String status;
	private String charge;
	private Timestamp updateDate;
	private Timestamp createDate;
	
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
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
	public int getKanbanDetailNo() {
		return kanbanDetailNo;
	}
	public void setKanbanDetailNo(int kanbanDetailNo) {
		this.kanbanDetailNo = kanbanDetailNo;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "KanbanVo [id=" + id + ", name=" + name + ", spaceName=" + spaceName + ", managerNo=" + managerNo
				+ ", memberNo=" + memberNo + ", kanbanDetailNo=" + kanbanDetailNo + ", spaceNo=" + spaceNo
				+ ", spaceMemberNo=" + spaceMemberNo + ", content=" + content + ", status=" + status + ", charge="
				+ charge + ", updateDate=" + updateDate + ", createDate=" + createDate + "]";
	}
	
}
