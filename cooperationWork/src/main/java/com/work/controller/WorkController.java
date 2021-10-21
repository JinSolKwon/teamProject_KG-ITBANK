package com.work.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.work.dto.MemberVo.MemberVO;
import com.work.service.MemberService;
import com.work.service.SpaceService;
import com.work.service.WorkService;

@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@RequestMapping("/work/*") // 모든맵핑은 /member/를 상속
public class WorkController {
    // 로깅을 위한 변수
    private static final Logger logger = LoggerFactory.getLogger(WorkController.class);
    
    @Inject
    WorkService workService;
    
    // 01. 로그인 화면 
    @RequestMapping("work")
    public String work(){
        return "work/work";    // views/member/login.jsp로 포워드
    }
}