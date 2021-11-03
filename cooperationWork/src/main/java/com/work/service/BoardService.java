package com.work.service;

import java.util.List;

import com.work.dto.BoardVo;

public interface BoardService {
	
	public abstract int articleCount(int spaceNo);
	
	public abstract List<BoardVo> list(int spaceNo, int spaceMemberNo, int start, int end);
	
	public abstract BoardVo read(int boardDetailNo);
	
	public abstract void write(BoardVo vo);
}
