package com.work.dto.dao;

import java.util.List;

import com.work.dto.InviteList;
import com.work.dto.MemberVO;

public interface MemberDao {
	
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	public MemberVO login(MemberVO vo) throws Exception;
	
	public List<InviteList> inviteList(String id) throws Exception;
}
