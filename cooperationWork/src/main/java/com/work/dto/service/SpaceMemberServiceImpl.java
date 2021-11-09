package com.work.dto.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.work.dto.SpaceMemberVO;
import com.work.dto.dao.SpaceMemberDao;

@Service
public class SpaceMemberServiceImpl implements SpaceMemberService{
	
	@Inject SpaceMemberDao dao;
	
	@Override
	public void memberInsert(SpaceMemberVO vo) throws Exception {
		System.out.println("SpaceMemberService:"+vo);
		dao.memberInsert(vo);
	}
	
	
}
