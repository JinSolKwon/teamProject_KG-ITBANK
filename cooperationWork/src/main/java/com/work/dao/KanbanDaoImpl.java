package com.work.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.work.dto.KanbanVo;

@Repository
public class KanbanDaoImpl implements KanbanDao {
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public KanbanDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public List<KanbanVo> toDoList(int spaceNo) {
		return sqlSessionTemplate.selectList("selectToDo", spaceNo);
	}
	
	@Override
	public List<KanbanVo> ProgressList(int spaceNo) {
		return sqlSessionTemplate.selectList("selectPro", spaceNo);
	}
	
	@Override
	public List<KanbanVo> doneList(int spaceNo) {
		return sqlSessionTemplate.selectList("selectDone", spaceNo);
	}
	
	@Override
	public void insertKanban(KanbanVo vo) {
		sqlSessionTemplate.insert("insertKanban",vo);	
	}
}
