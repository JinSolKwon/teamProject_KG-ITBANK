package com.work.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.work.dao.WorkDao;
import com.work.dto.WorkVo;

@Service // 현재 클래스를 스프링에서 관리하는 service bean으로 등록
public class WorkServiceImpl implements WorkService {
    
    @Inject
    WorkDao workDao;
    
    // 01_01. 회원 로그인체크
    @Override
    public boolean loginCheck(WorkVo vo, HttpSession session) {
        boolean result = workDao.loginCheck(vo);
        if (result) { // true일 경우 세션에 등록
        	WorkVo vo2 = viewMember(vo);
            // 세션 변수 등록
            session.setAttribute("userId", vo2.getUserId());
            session.setAttribute("userName", vo2.getUserName());
        } 
        return result;
    }
    // 01_02. 회원 로그인 정보
    @Override
    public WorkVo viewMember(WorkVo vo) {
        return workDao.viewMember(vo);
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
 