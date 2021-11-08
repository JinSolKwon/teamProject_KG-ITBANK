package com.work.dto.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.dto.InviteList;
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
		int memberInfo = vo.getMemberNo();
		service.inviteMember(vo, spaceInfo, memberInfo);		
			
		vo.setMemberNo(memberInfo);
		vo.setSpaceNo(spaceInfo);	
		session.setAttribute("inviteMember_no", memberInfo);
		memberInfo = (int)session.getAttribute("inviteMember_no");
		session.setAttribute("invite_id", vo.getId());
		session.setAttribute("invite_no", vo.getInviteNo());
		
		
		vo.setMemberNo(memberInfo);
		vo.setSpaceNo(spaceInfo);
			
		vo.setInviteNo((int)session.getAttribute("invite_no"));
		System.out.println(vo);
		System.out.println("invite_no:"+ session.getAttribute("invite_no"));
		System.out.println("invite_id:"+ session.getAttribute("invite_id"));
			
		
		return "/space/inviteMember";
	}
	
	
//	@RequestMapping(value="/member/login")
//	public String getInviteList(Model model,InviteVO vo) {
//		logger.info("get InviteList");
//		List<InviteList> list = service.inviteList();
//		System.out.println("listvo:"+vo);
//		model.addAttribute("list", list);
//		return "/member/login";
//	}
	
	
	

	
}
