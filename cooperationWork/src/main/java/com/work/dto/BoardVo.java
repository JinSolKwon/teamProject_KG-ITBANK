package com.work.dto;

import java.sql.Timestamp;

public class BoardVo {
	// MEMBER테이블
	private String id;
	private String name;
	// SPACE 테이블
	private String spaceName;
	private int managerNo;
	// SPACE_MEMBER 테이블
	private int memberNo;
	// BOARD_DETAIL
	private int boardDetailNo;
	private int spaceNo;
	private int spaceMemberNo;
	private String subject;
	private String content;
	private String fileName;
	private Timestamp createDate;
	
	public BoardVo() {}
	
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

	public int getBoardDetailNo() {
		return boardDetailNo;
	}

	public void setBoardDetailNo(int boardDetailNo) {
		this.boardDetailNo = boardDetailNo;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "BoardVo [id=" + id + ", name=" + name + ", spaceName=" + spaceName + ", managerNo=" + managerNo
				+ ", memberNo=" + memberNo + ", boardDetailNo=" + boardDetailNo + ", spaceNo=" + spaceNo
				+ ", spaceMemberNo=" + spaceMemberNo + ", subject=" + subject + ", content=" + content + ", fileName="
				+ fileName + ", createDate=" + createDate + "]";
	}
	
}
