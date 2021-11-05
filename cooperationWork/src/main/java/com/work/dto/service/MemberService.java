package com.work.dto.service;

import com.work.dto.MemberVO;

public interface MemberService {
	
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
}
