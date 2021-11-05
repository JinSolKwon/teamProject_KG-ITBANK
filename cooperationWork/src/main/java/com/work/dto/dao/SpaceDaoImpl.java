package com.work.dto.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.work.dto.SpaceVO;

@Repository
public class SpaceDaoImpl implements SpaceDao{
	
	@Inject SqlSession sql;
	
	@Override
	public void spaceCreate(SpaceVO vo) throws Exception {
		System.out.println("SpaceVO:"+vo);
		if (vo.getSpaceName().equals(null) || vo.getSpaceName().equals("")) {
			sql.insert("spaceCreate1", vo);
		} else {
			sql.insert("spaceCreate2", vo);
		}
	}
	
//	@Override
//	public SpaceVO spaceList(SpaceVO vo) throws Exception {
//		
//		return sql.selectOne("spaceList", vo);
//	}
}
