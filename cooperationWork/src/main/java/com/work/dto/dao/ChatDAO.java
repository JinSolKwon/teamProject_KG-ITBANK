package com.work.dto.dao;

import java.util.List;

import com.work.dto.vo.*;

public interface ChatDAO {
	//테스트테스트 mybatis 테스트 ~ 성공했다~
	public List<TestBean> selectNum() throws Exception;
	
	//채팅방 생성
	public void insertPRoom(int space_no) throws Exception;
	
	public void insertGRoom(GChatRoom gcr) throws Exception;
	
	//채팅방 리스트 받아오기
	public List<PChatRoom> selectPRoom(int space_no) throws Exception;
	
	public List<GChatRoom> selectGRoom(int space_no) throws Exception;
	
	
	//채팅방 인원배정
	public void insertPRoomMember(PChatRoomMember pcrm) throws Exception;
	
	public void insertGRoomMember(GChatRoomMember gcrm) throws Exception;
	
	
	
	
}
