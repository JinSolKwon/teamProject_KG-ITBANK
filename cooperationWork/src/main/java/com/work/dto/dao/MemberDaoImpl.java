package com.work.dto.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.work.dto.InviteList;
import com.work.dto.MemberVO;

@Repository 
public class MemberDaoImpl implements MemberDao{
	
	@Inject SqlSession sql;
	
	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		System.out.println(vo);
		System.out.println("Dao는 됨");
		
		sql.insert("register", vo);
	}
	
	//로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return sql.selectOne("login", vo);
	}
	
	@Override
	public List<InviteList> inviteList(String id) throws Exception{
		return sql.selectList("inviteList", id);
	}
}
