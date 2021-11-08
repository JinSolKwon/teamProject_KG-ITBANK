package com.work.dto.dao;

import java.util.List;
import java.util.Map;

import com.work.dto.InviteList;

public interface InviteDao {
	
	public void insertMember(Map<String, Object> map) throws Exception;
	
	public int selectMemberNo(String id);
	
//	public List<InviteList> inviteList(String id);
}
