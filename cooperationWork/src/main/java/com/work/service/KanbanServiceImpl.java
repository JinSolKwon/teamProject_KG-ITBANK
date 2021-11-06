package com.work.service;

import java.util.HashMap;
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
}
