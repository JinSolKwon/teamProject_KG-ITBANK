package com.work.dto.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.dto.InviteVO;
import com.work.dto.service.InviteService;

@Controller
public class InviteController {
	private static final Logger logger = LoggerFactory.getLogger(InviteController.class);
	
	 
	
	@Inject
	InviteService service;
	
	
	//멤버 초대
	@RequestMapping(value="/space/inviteMember", method = RequestMethod.GET)
	public void getInviteMember(Map<String,Object> map) throws Exception{
		logger.info("get InviteMember");
		
	}
	
	@RequestMapping(value="/space/inviteMember", method=RequestMethod.POST)
	public String postInviteMember(InviteVO vo,HttpServletRequest req,HttpSession session) throws Exception{
		logger.info("post InviteMember");
		for(int i=0; i<vo.getId().size(); i++) {
			for(int j =0; j<vo.getId().size(); j++) {
				System.out.println(vo.getId().get(j));
			}
		}
		session = req.getSession();
		int spaceInfo = (int)session.getAttribute("space_no");
			
			service.inviteMember(vo, spaceInfo);		
			session.setAttribute("invite_id", vo.getId());
			
		
		
		return "/space/inviteMember";
	}
	
	
}
