package com.work.dto.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.work.dto.InviteList;
import com.work.dto.MemberVO;
import com.work.dto.dao.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject MemberDao dao;
	
	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		System.out.println(vo);
		
		dao.register(vo);
	}
	
	//로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}
	
	@Override
	public List<InviteList> inviteList(String id) throws Exception{
		return dao.inviteList(id);
	}
}
