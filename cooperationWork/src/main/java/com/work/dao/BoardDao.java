package com.work.dao;

import java.util.HashMap;
import java.util.List;

import com.work.dto.BoardVo;

public interface BoardDao {
	//게시글 목록 메서드
	public abstract List<BoardVo> boardList(HashMap<String, Integer> map);
	
	//게시글 작성 메서드
	public abstract void writeBoard(BoardVo boardVo);
	
	//게시글 갯수 확인 메서드
	public abstract int boardCount(int spaceNo);
	
	//게시글 상세정보 가져오기 메서드
	public abstract BoardVo getArticle(int boardDetailNo);
}
