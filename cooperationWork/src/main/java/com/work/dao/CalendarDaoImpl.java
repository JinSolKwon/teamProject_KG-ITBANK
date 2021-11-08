package com.work.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.work.dto.BoardVo;
import com.work.dto.CalendarVo;

@Repository
public class CalendarDaoImpl implements CalendarDao {
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public CalendarDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public void addSchedule(CalendarVo vo) {
		sqlSessionTemplate.insert("addSchedule", vo);
		
	}
	
	@Override
	public List<CalendarVo> showSchedule(int spaceNo) {
		return sqlSessionTemplate.selectList("showSchedule", spaceNo);
	}
}
