package com.work.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.BoardDao;
import com.work.dto.BoardVo;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao; 
	
	@Override
	public int articleCount(int spaceNo) {
		return boardDao.boardCount(spaceNo);
	}
	
	@Override
	public List<BoardVo> list(int spaceNo, int spaceMemberNo, int start, int end) {
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("spaceNo", spaceNo);
		map.put("spaceMemberNo", spaceMemberNo);
		map.put("start", start);
		map.put("end", end);
		
		return boardDao.boardList(map);
	}
	
	@Override
	public BoardVo read(int boardDetailNo) {
		return boardDao.getArticle(boardDetailNo);
	}
	
	@Override
	public void write(BoardVo vo) {
		boardDao.writeBoard(vo);
	}
}
