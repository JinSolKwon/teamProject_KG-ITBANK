package com.work.dto.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.work.dto.InviteList;
import com.work.dto.InviteVO;

@Repository
public class InviteDaoImpl implements InviteDao{
	
	@Inject SqlSessionTemplate sql;
	
	InviteVO vo;
	
	@Override
	public void insertMember(Map<String, Object> map) throws Exception {
		 sql.insert("inviteMember", map);
	}
	
	@Override
	public int selectMemberNo(String id) {
		return sql.selectOne("inviteMemberNo",id);
	}
	
//	@Override
//	public List<InviteList> inviteList(String id) {
//			return sql.selectList("com.work.dto.dao.InviteDaoImpl.inviteList");
		}	
	

