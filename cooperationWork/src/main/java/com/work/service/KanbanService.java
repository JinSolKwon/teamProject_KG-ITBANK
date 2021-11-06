package com.work.service;

import java.util.List;

import com.work.dto.KanbanVo;

public interface KanbanService {
	
	public abstract List<KanbanVo> toDoList(int spaceNo);
	
	public abstract List<KanbanVo> progressList(int spaceNo);
	
	public abstract List<KanbanVo> doneList(int spaceNo);
	
	public abstract void insertKanban(KanbanVo vo);
	
	public abstract KanbanVo selectOne(int kanbanDetailNo);
	
	public abstract List<KanbanVo> nameList(int spaceNo);
	
	public abstract int updateKanban(KanbanVo vo);
	
	public abstract String pass(int kanbanDetailNo);
	
	public abstract int deleteKanban(int kanbanDetailNo);
}
