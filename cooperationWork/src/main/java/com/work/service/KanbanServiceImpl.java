package com.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.KanbanDao;
import com.work.dto.KanbanVo;

@Service
public class KanbanServiceImpl implements KanbanService{
	
	@Autowired
	private KanbanDao kanbanDao; 
	
	@Override
	public List<KanbanVo> toDoList(int spaceNo) {
		return kanbanDao.toDoList(spaceNo);
	}
	
	@Override
	public List<KanbanVo> progressList(int spaceNo) {
		return kanbanDao.ProgressList(spaceNo);
	}
	
	@Override
	public List<KanbanVo> doneList(int spaceNo) {
		return kanbanDao.doneList(spaceNo);
	}
	
	@Override
	public void insertKanban(KanbanVo vo) {
		kanbanDao.insertKanban(vo);
	}
	
	@Override
	public KanbanVo selectOne(int kanbanDetailNo) {
		return kanbanDao.selectOne(kanbanDetailNo);
	}
	
	@Override
	public List<KanbanVo> nameList(int spaceNo) {
		return kanbanDao.selectMemberAllName(spaceNo);
	}
	
	@Override
	public int updateKanban(KanbanVo vo) {
		return kanbanDao.updateKanban(vo);
	}
	
	@Override
	public String pass(int kanbanDetailNo) {
		return kanbanDao.getPass(kanbanDetailNo);
	}
	
	@Override
	public int deleteKanban(int kanbanDetailNo) {
		return kanbanDao.deleteKanban(kanbanDetailNo);
	}
}
