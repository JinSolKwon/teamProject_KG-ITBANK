package com.work.dto.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dto.dao.ChatDAO;
import com.work.dto.vo.GChatRoom;
import com.work.dto.vo.GChatRoomMember;
import com.work.dto.vo.PChatRoom;
import com.work.dto.vo.PChatRoomMember;
import com.work.dto.vo.TestBean;

@Service
public class ChatServiceImpl implements ChatService{

	@Autowired
	private ChatDAO dao;

	@Override
	public List<TestBean> selectNum() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectNum();
	}

	@Override
	public void insertPRoom(int space_no) throws Exception {
		// TODO Auto-generated method stub
		dao.insertPRoom(space_no);
	}

	@Override
	public void insertGRoom(GChatRoom gcr) throws Exception {
		// TODO Auto-generated method stub
		dao.insertGRoom(gcr);
	}

	@Override
	public List<PChatRoom> selectPRoom(int spaceno) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectPRoom(spaceno);
	}

	@Override
	public List<GChatRoom> selectGRoom(int spaceno) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectGRoom(spaceno);
	}

	@Override
	public void insertPRoomMember(PChatRoomMember pcrm) throws Exception {
		// TODO Auto-generated method stub
		dao.insertPRoomMember(pcrm);
	}

	@Override
	public void insertGRoomMember(GChatRoomMember gcrm) throws Exception {
		// TODO Auto-generated method stub
		dao.insertGRoomMember(gcrm);
	}	
	
	
		
}
