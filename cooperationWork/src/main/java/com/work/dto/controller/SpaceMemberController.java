package com.work.dto.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.dto.SpaceMemberVO;
import com.work.dto.SpaceVO;

@Controller
public class SpaceMemberController {
	private static final Logger logger = LoggerFactory.getLogger(SpaceController.class);
	
	@RequestMapping(value = "/space/memberInsert", method=RequestMethod.GET)
	public void getMemberInsert(SpaceMemberVO vo) throws Exception{
		logger.info("get MemberInsert");
	}
	
	@RequestMapping(value = "/space/memberInsert", method=RequestMethod.POST)
	public String postMemberInsert(SpaceMemberVO vo, HttpServletRequest req,HttpSession session) throws Exception{
		logger.info("post MemberInsert");
		
		
		return "/member/login";
	}
}
