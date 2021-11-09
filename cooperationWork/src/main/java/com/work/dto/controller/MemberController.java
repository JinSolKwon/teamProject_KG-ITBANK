package com.work.dto.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.work.dto.InviteList;
import com.work.dto.MemberVO;
import com.work.dto.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;
	
	
	
	//회원가입
	@RequestMapping(value = "/member/register", method = RequestMethod.GET)
	public void getRegister() throws Exception{
		logger.info("get register");
	}
	@RequestMapping(value = "/member/register", method = RequestMethod.POST)
	public String postRegister(MemberVO vo) throws Exception{
		logger.info("post register");
		
		System.out.println(vo);
		
		service.register(vo);
		
		return "redirect:/";
	}
	
	//로그인
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	public String login(Model model,MemberVO vo,  HttpServletRequest req, HttpServletResponse res, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		
		
		HttpSession session = req.getSession();
		System.out.println("req:"+req);
		MemberVO login = service.login(vo);
		
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		} else {
			session.setAttribute("member", login);
			session.setAttribute("member_no", login.getMemberNo());
			session.setAttribute("id", login.getId());
		}
		System.out.println(session.getAttribute("member_no"));
		System.out.println(session.getAttribute("member"));
		System.out.println(session.getAttribute("id"));
		
		List<InviteList> inv = service.inviteList((String)session.getAttribute("id"));
		
		model.addAttribute("invite",inv);
		
		

		
		return "/member/login";
	}
	//로그아웃
	@RequestMapping(value = "/member/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		logger.info("get logout");
		
		session.invalidate();
		
		return "redirect:/";
	}
	
//	@RequestMapping(value = "/member/inviteMember", method=RequestMethod.GET)
//	public void getMemberInsert(SpaceMemberVO vo) throws Exception{
//		logger.info("get MemberInsert");
//	}
//	@RequestMapping(value = "/member/inviteMember", method=RequestMethod.POST)
//	public String postMemberInsert(Model model, SpaceMemberVO vo, HttpServletRequest req,HttpSession session) throws Exception{
//		logger.info("post MemberInsert");
//		
//		session = req.getSession();
//		int spaceNoInfo = (int)session.getAttribute("space_no");
//		vo.setSpaceNo(spaceNoInfo);
//		int memberInfo = (int)session.getAttribute("member_no");
//		vo.setMemberNo(memberInfo);
//		
//		System.out.println(vo);
//		
//		service.memberInsert(vo);
//		model.addAttribute("sm", vo);
//		
//		return "/member/login";
//	}
		
}
