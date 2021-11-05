package com.work.dto.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.work.dto.SpaceMemberVO;

@Repository
public class SpaceMemberDaoImpl implements SpaceMemberDao{
	
	@Inject SqlSession sql;
	
	@Override
	public void memberInsert(SpaceMemberVO vo) throws Exception {
		sql.insert("memberInsert", vo);
	}
}
