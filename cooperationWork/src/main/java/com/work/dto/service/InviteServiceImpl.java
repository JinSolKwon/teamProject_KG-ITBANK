package com.work.dto.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dto.InviteList;
import com.work.dto.InviteUtils;
import com.work.dto.InviteVO;
import com.work.dto.dao.InviteDao;

@Service
public class InviteServiceImpl implements InviteService{
	
	InviteDao dao;
	InviteUtils inviteUtils;
	
	
	@Autowired
	public InviteServiceImpl(InviteDao dao, InviteUtils inviteUtils) {
		super();
		this.dao = dao;
		this.inviteUtils = inviteUtils;
	}



	@Override
	public void inviteMember(InviteVO vo, int spaceInfo, int memberInfo) throws Exception {
		if(vo.getId() != null) {
			System.out.println(inviteUtils);
			List<Map<String,Object>> listMap = inviteUtils.inviteList(vo, spaceInfo, memberInfo);
			
			int inviteSize = listMap.size();
			if(inviteSize > 10) {
				inviteSize = 10;
			}
			for (int i=0; i<inviteSize; i++) {
			 dao.insertMember(listMap.get(i));
			}
	}	
	}
	
	@Override
	public int inviteMemberNo(String id) {
		return dao.selectMemberNo(id);
	}
	
//	@Override
//	public List<InviteList> inviteList(String id) throws Exception{
//		return dao.inviteList(id);
//	}

}