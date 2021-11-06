package com.work.dao;


import java.util.List;


import com.work.dto.KanbanVo;

public interface KanbanDao {
	//Todo 목록 메서드
	public abstract List<KanbanVo> toDoList(int spaceNo); 
	
	//Progress 목록 메서드
	public abstract List<KanbanVo> ProgressList(int spaceNo);
	
	//Done 목록 메서드
	public abstract List<KanbanVo> doneList(int spaceNo);
	
	//칸반보드 글 넣기
	public abstract void insertKanban(KanbanVo vo);
	
	//칸반보드 글 하나 가져오기
	public abstract KanbanVo selectOne(int kanbanDetailNo);
	
	//해당 워크스페이스에 소속된 멤버 이름 모두 가져오기
	public abstract List<KanbanVo> selectMemberAllName(int spaceNo);
	
	//칸반보드 글 수정
	public abstract int updateKanban(KanbanVo vo);
	
	// 작성 유저 비밀번호 가져오기
	public abstract String getPass(int kanbanDetailNo);
	
	// 해당 칸반 게시물 삭제
	public abstract int deleteKanban(int kanbanDetailNo);
	
}
