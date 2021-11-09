package com.work.dto.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.work.dto.vo.GChatRoom;
import com.work.dto.vo.GChatRoomMember;
import com.work.dto.vo.PChatRoom;
import com.work.dto.vo.PChatRoomMember;
import com.work.dto.vo.TestBean;


@Repository
public class ChatDAOImpl implements ChatDAO{
	static final String namespace = "com.work.dto.dao.ChatDAOImpl";
	
	@Autowired
	SqlSession sqlSession;
	
	//테스트테스트 mybatis 테스트 ~ 성공했다~
	@Override
	public List<TestBean> selectNum() throws Exception{
		int num = 0;
		System.out.println("SqlSession===>"+sqlSession);
		return sqlSession.selectList(namespace+".selectNum");
	}

	@Override
	public void insertPRoom(int space_no) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INSERTPROOM");
		sqlSession.insert(namespace+".insertPRoom", space_no);
	}

	@Override
	public void insertGRoom(GChatRoom gcr) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INSERTGROOM");
		sqlSession.insert(namespace+".insertGRoom",gcr);
	}

	@Override
	public List<PChatRoom> selectPRoom(int spaceno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SELECTPROOM\n/n");
		return sqlSession.selectList(namespace+".selectPRoom",spaceno);
	}

	@Override
	public List<GChatRoom> selectGRoom(int spaceno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SELECTGROOM\n/n");
		
		return sqlSession.selectList(namespace+".selectGRoom",spaceno);
	}


	@Override
	public void insertPRoomMember(PChatRoomMember pcrm) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("insertPRoomMember");
		sqlSession.insert(namespace+".insertPRoomMember",pcrm);
	}

	@Override
	public void insertGRoomMember(GChatRoomMember gcrm) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("insertGRoomMember");
		sqlSession.insert(namespace+".insertGRoomMember",gcrm);
	}
	
	
}
