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
		return sqlSessionTemplate.selectOne("countArticle", spaceNo);
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
	public String name(int spaceMemberNo) {
		return sqlSessionTemplate.selectOne("writeName", spaceMemberNo);
	}
	
	@Override
	public BoardVo getArticle(int boardDetailNo) {
		return sqlSessionTemplate.selectOne("selectArticle", boardDetailNo);
	}
	
	@Override
	public String getPass(int boardDetailNo) {
		return sqlSessionTemplate.selectOne("pass", boardDetailNo);
	}
	
	@Override
	public int deleteBoard(int boardDetailNo) {
		return sqlSessionTemplate.delete("deleteArticle", boardDetailNo);
	}
	
	@Override
	public int selectMember(int boardDetailNo) {
		return sqlSessionTemplate.selectOne("selectMember", boardDetailNo);
	}
}
