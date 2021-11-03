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
	private Timestamp updateDate;
	private Timestamp createDate;
}
