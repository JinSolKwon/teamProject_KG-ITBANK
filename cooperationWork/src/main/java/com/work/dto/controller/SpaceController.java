package com.work.dto.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.dto.SpaceVO;
import com.work.dto.service.InviteService;
import com.work.dto.service.SpaceService;

@Controller
public class SpaceController {
	private static final Logger logger = LoggerFactory.getLogger(SpaceController.class);
	
	@Inject
	SpaceService service;
	
	//스페이스 생성
	@RequestMapping(value = "/space/spaceCreate", method = RequestMethod.GET)
	public void getSpaceCreate(SpaceVO vo) throws Exception{
		logger.info("get spaceCreate");
		
		
	}
	@RequestMapping(value = "/space/spaceCreate", method = RequestMethod.POST)
	public String postSpaceCreate(SpaceVO vo, HttpServletRequest req,HttpSession session) throws Exception{
		logger.info("post spaceCreate");
		
		session = req.getSession();
				
		int loginInfo = (int)session.getAttribute("member_no");
		System.out.println(vo);
		
		vo.setManagerNo(loginInfo);
		service.spaceCreate(vo);
		session = req.getSession();
		
		session.setAttribute("space_no", vo.getSpaceNo());
		System.out.println("space_no:"+session.getAttribute("space_no"));
		
		return "/space/inviteMember";
		
	}
//	@RequestMapping(value = "/space/spaceList", method=RequestMethod.POST)
//	public String spaceList(SpaceVO vo,HttpServletRequest req,HttpSession session) throws Exception{
//		logger.info("post list");
//		
//		session = req.getSession();
//		SpaceVO spaceList = service.spaceList(vo);
//		session.setAttribute("space_no", spaceList.getSpaceNo());
//		System.out.println(session.getAttribute("space_no"));
//		
//		return "/space/inviteMember";
//	}
	
	
}
