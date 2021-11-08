package com.work.dto.service;

import java.util.List;

import com.work.dto.InviteList;
import com.work.dto.InviteVO;

public interface InviteService {
	
	public void inviteMember(InviteVO vo, int spaceInfo, int memberInfo) throws Exception;
	
	public int inviteMemberNo(String id);
	
//	public List<InviteList> inviteList(String id);
}
