package com.work.dto.dao;

import com.work.dto.MemberVO;

public interface MemberDao {
	
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	public MemberVO login(MemberVO vo) throws Exception;
}
