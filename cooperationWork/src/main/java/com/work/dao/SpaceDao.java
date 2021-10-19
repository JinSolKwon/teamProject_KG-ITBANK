package com.work.dao;

import javax.servlet.http.HttpSession;

import com.work.dto.SpaceVo;

public interface SpaceDao {
	 // 01_01. 회원 로그인 체크
    public boolean loginCheck(SpaceVo vo);
    // 01_02. 회원 로그인 정보
    public SpaceVo viewMember(SpaceVo vo);
    // 02. 회원 로그아웃
    public void logout(HttpSession session);
}
