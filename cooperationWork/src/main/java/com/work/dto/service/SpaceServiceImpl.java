package com.work.dto.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.work.dto.SpaceVO;
import com.work.dto.dao.SpaceDao;

@Service
public class SpaceServiceImpl implements SpaceService{
	
	@Inject SpaceDao dao;
	
	//스페이스 생성
	@Override
	public void spaceCreate(SpaceVO vo) throws Exception {
		System.out.println("SpaceService:"+vo);
		dao.spaceCreate(vo);
	}
//	@Override
//	public SpaceVO spaceList(SpaceVO vo) throws Exception {
//		return dao.spaceList(vo);
//	}
	

}
