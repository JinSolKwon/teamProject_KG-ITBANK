package com.work.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.work.dao.SpaceDao;
import com.work.dto.SpaceVo;

@Service // 현재 클래스를 스프링에서 관리하는 service bean으로 등록
public class SpaceServiceImpl implements SpaceService {
    
    @Inject
    SpaceDao spaceDao;
    
    // 01_01. 회원 로그인체크
    @Override
    public boolean loginCheck(SpaceVo vo, HttpSession session) {
        boolean result = spaceDao.loginCheck(vo);
        if (result) { // true일 경우 세션에 등록
        	SpaceVo vo2 = viewMember(vo);
            // 세션 변수 등록
            session.setAttribute("userId", vo2.getUserId());
            session.setAttribute("userName", vo2.getUserName());
        } 
        return result;
    }
    // 01_02. 회원 로그인 정보
    @Override
    public SpaceVo viewMember(SpaceVo vo) {
        return spaceDao.viewMember(vo);
    }
    // 02. 회원 로그아웃
    @Override
    public void logout(HttpSession session) {
        // 세션 변수 개별 삭제
        // session.removeAttribute("userId");
        // 세션 정보를 초기화 시킴
        session.invalidate();
    }
}
 