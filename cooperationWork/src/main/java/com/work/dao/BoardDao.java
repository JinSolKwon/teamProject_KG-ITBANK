package com.work.dao;

import java.util.HashMap;
import java.util.List;

import com.work.dto.BoardVo;

public interface BoardDao {
	//게시글 목록 메서드
	public abstract List<BoardVo> boardList(HashMap<String, Integer> map);
	
	//로그인한 인원의 이름 가져오기 메서드(spaceMemberNo 세션 이용)
	public abstract String name(int spaceMemberNo);
	
	//게시글 작성 메서드
	public abstract void writeBoard(BoardVo boardVo);
	
	//게시글 갯수 확인 메서드
	public abstract int boardCount(int spaceNo);
	
	//게시글 상세정보 가져오기 메서드
	public abstract BoardVo getArticle(int boardDetailNo);
	
	//패스워드 가져오기 메서드
	public abstract String getPass(int boardDetailNo);
	
	//게시글 삭제 메서드
	public abstract int deleteBoard(int boardDetailNo);
	
	//작성 유저 번호 가져오기 메서드
	public abstract int selectMember(int boardDetailNo);
	
	// 파일 수정 시 기존파일 삭제 메서드
	public abstract int deleteFile(HashMap<String, Integer> map);
	
	// 게시물 수정 메서드
	public abstract int update(BoardVo vo);
}
