package com.work.dto.dao;

import java.util.List;

import com.work.dto.InviteList;
import com.work.dto.MemberVO;
import com.work.dto.SpaceList;
import com.work.dto.SpaceMemberVO;

public interface MemberDao {
	
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	public MemberVO login(MemberVO vo) throws Exception;
	
	public List<InviteList> inviteList(String id) throws Exception;
	
	public void memberInsert(SpaceMemberVO vo) throws Exception;
	
	public List<SpaceList> spaceList(int memberNo) throws Exception;
}
