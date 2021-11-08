package com.work.dto.service;

import java.util.List;

import com.work.dto.InviteList;
import com.work.dto.MemberVO;

public interface MemberService {
	
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	public List<InviteList> inviteList(String id) throws Exception;
}
