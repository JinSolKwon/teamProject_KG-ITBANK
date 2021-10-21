package com.work.dao;

import javax.servlet.http.HttpSession;

import com.work.dto.WorkVo;

public interface WorkDao {
	 // 01_01. 회원 로그인 체크
    public boolean loginCheck(WorkVo vo);
    // 01_02. 회원 로그인 정보
    public WorkVo viewMember(WorkVo vo);
    // 02. 회원 로그아웃
    public void logout(HttpSession session);
}
