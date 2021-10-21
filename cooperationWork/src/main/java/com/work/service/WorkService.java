package com.work.service;

import javax.servlet.http.HttpSession;

import com.work.dto.WorkVo;

public interface WorkService {
	// 01_01. 회원 로그인 체크
    public boolean loginCheck(WorkVo vo, HttpSession session);
    // 01_02. 회원 로그인 정보
    public WorkVo viewMember(WorkVo vo);
    // 02. 회원 로그아웃
    public void logout(HttpSession session);
}
