package com.work.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.service.CalendarService;

@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@RequestMapping("/work/*") // 모든맵핑은 /member/를 상속
public class CalendarController {
	
	@Inject
	CalendarService calendarService;
	// 로깅을 위한 변수
    private static final Logger logger = LoggerFactory.getLogger(WorkController.class);
    
    @RequestMapping("calendarMain")
    public String calendarMain(Model model, HttpSession session) {
    	
    	return "work/calendarMain";
    }
    
}
