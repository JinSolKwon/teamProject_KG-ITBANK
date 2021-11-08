package member.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import member.domain.MemberVO;
import member.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	public void setMemberService(MemberService memberservice) {
		this.service = memberservice;
	}
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//회원가입 get method
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void getRegister() throws Exception{
		logger.info("get register");
	}
	
	//회원가입 post method
	@RequestMapping(value="/register", method = RequestMethod.POST)
		public String postRegister(MemberVO vo) throws Exception{
		logger.info("post register");
		int result = service.idChk(vo);
		try {
			if(result ==1 ) {
				return "/member/register";
			}else if(result == 0) {
				service.register(vo);
			}
		}catch(Exception e) {
			throw new RuntimeException();
		}
		return "member/registerDone";
	}
	
	
	//로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		HttpSession session = req.getSession();
		MemberVO login = service.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("member", login);
		}
		
		return "redirect:/";
	}

	//로그아웃
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:/";
	}
	
	//정보수정 get
	@RequestMapping(value="/memberUpdateView", method = RequestMethod.GET)
	public String registerUpdateView() throws Exception{
		return "member/memberUpdateView";
	}
	
	//정보수정 post
	@RequestMapping(value="/memberUpdate", method = RequestMethod.POST)
	public String memberUpdate(MemberVO vo, HttpSession session, RedirectAttributes rttr) throws Exception{
		MemberVO member = (MemberVO)session.getAttribute("member");
		String sessionPw = member.getPassword();
		String voPw = vo.getPassword();
		 if(!(sessionPw.equals(voPw))) {
			rttr.addFlashAttribute("msg",false);
			return "redirect:/member/memberUpdateView";
		 }
		service.memberUpdate(vo);
		session.invalidate();
		return "member/memberUpdateDone";
	}
	
	//회원 탈퇴 get
	@RequestMapping(value="/memberDeleteView", method = RequestMethod.GET)
	public String memberDeleteView() throws Exception{
		return "member/memberDeleteView";
	}
	
	//회원 탈퇴 post
	@RequestMapping(value="/memberDelete", method = RequestMethod.POST)
	public String memberDelete(MemberVO vo, HttpSession session, RedirectAttributes rttr) throws Exception{
		MemberVO member = (MemberVO)session.getAttribute("member");
		String sessionPw = member.getPassword();
		String voPw = vo.getPassword();
		if(!(sessionPw.equals(voPw))) {
			rttr.addFlashAttribute("msg",false);
			return "redirect:/member/memberDeleteView";
		}
		service.memberDelete(vo);
		session.invalidate();
		return "member/memberDeleteDone";
	}
	
	//아이디 중복체크
	@ResponseBody
	@RequestMapping(value="/idChk", method = RequestMethod.POST)
	public int idChk(MemberVO vo) throws Exception{
		int result = service.idChk(vo);
		return result;
	}
	
	//이메일 중복체크
	@ResponseBody
	@RequestMapping(value="/emailChk", method = RequestMethod.POST)
	public int emailChk(MemberVO vo) throws Exception{
		int result = service.emailChk(vo);
		return result;
	}
	
	//비번 체크
	@ResponseBody
	@RequestMapping(value="/pwChk", method = RequestMethod.POST)
	public int pwChk(MemberVO vo) throws Exception{
		int result = service.pwChk(vo);
		return result;
	}
	
	//아이디 찾기 페이지 
	@RequestMapping(value="/findIdForm")
	public String findIdView() {
		return "member/findId";
	}
	
	//아이디 찾기
	@RequestMapping(value="/findId", method = RequestMethod.POST)
	public String findId(MemberVO vo, Model md) throws Exception{
		MemberVO user = service.findId(vo);	
		if(user == null) {
			md.addAttribute("check",1);
			return "member/findId";
		}else {
			md.addAttribute("check",0);
			md.addAttribute("id",user.getId());
		}
		return "member/findIdResult";
	}
	
	//비밀번호 찾기 페이지 
		@RequestMapping(value="/findPwForm")
		public String findPwView() {
			return "member/findPw";
		}
		
	//비번 찾기
	@RequestMapping(value="/findPw", method = RequestMethod.POST)
	public String findPw(MemberVO vo, Model md) throws Exception{
		MemberVO user = service.findPw(vo);
		if(user == null) {
			md.addAttribute("check",1);
			return "/member/findPw";
		}else {
			md.addAttribute("check", 0);
			md.addAttribute("password",user.getPassword());
		}
		return "member/findPwResult";
	}
}
