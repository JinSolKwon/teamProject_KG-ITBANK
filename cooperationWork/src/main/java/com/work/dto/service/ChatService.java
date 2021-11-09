package com.work.dto.service;

import java.util.List;

import com.work.dto.vo.GChatRoom;
import com.work.dto.vo.GChatRoomMember;
import com.work.dto.vo.PChatRoom;
import com.work.dto.vo.PChatRoomMember;
import com.work.dto.vo.TestBean;

public interface ChatService {
	public List<TestBean> selectNum() throws Exception;
	
	//채팅방 생성
	public void insertPRoom(int space_no) throws Exception;
	
	public void insertGRoom(GChatRoom gcr) throws Exception;
	
	//채팅방 리스트 받아오기
	public List<PChatRoom> selectPRoom(int spaceno) throws Exception;
	
	public List<GChatRoom> selectGRoom(int spaceno) throws Exception;
	
	
	
	//채팅방 인원배정
	public void insertPRoomMember(PChatRoomMember pcrm) throws Exception;
	
	public void insertGRoomMember(GChatRoomMember gcrm) throws Exception;
		
}
