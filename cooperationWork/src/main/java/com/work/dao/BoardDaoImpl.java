package com.work.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.work.dto.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public BoardDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public int boardCount(int spaceNo) {
		System.out.println(spaceNo);
		int num = sqlSessionTemplate.selectOne("countArticle", spaceNo);
		System.out.println(num);
		return num;
	}
	
	@Override
	public List<BoardVo> boardList(HashMap<String, Integer> map){
		return sqlSessionTemplate.selectList("boardList", map); 
	}
	
	@Override
	public void writeBoard(BoardVo vo) {
		sqlSessionTemplate.insert("writeBoard", vo);
	}
	
	@Override
	public BoardVo getArticle(int boardDetailNo) {
		return sqlSessionTemplate.selectOne("selectArticle", boardDetailNo);
	}
	
}
