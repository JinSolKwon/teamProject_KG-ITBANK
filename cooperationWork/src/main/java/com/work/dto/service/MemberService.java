package com.work.dto.service;

import java.util.List;

import com.work.dto.InviteList;
import com.work.dto.MemberVO;
import com.work.dto.SpaceMemberVO;

public interface MemberService {
	
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	public List<InviteList> inviteList(String id) throws Exception;
	
	//초대 수락(insert)
	public void memberInsert(SpaceMemberVO vo) throws Exception;
}
