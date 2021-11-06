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
	
	//게시글 상세정보 가져오기 메서드
	
	
	//패스워드 가져오기 메서드
	
	
	//게시글 삭제 메서드
	
	
	//작성 유저 번호 가져오기 메서드
	
	
	// 파일 수정 시 기존파일 삭제 메서드
	
	
	// 게시물 수정 메서드
	
}
