package com.work.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.work.dto.CalendarVo;
import com.work.service.CalendarService;

@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@RequestMapping("/work/*") // 모든맵핑은 /member/를 상속
public class CalendarController {
	
	@Inject
	CalendarService calendarService;
	// 로깅을 위한 변수
    private static final Logger logger = LoggerFactory.getLogger(WorkController.class);
    
    private static int spaceNo=1;
    private static int spaceMemberNo=2;
    
    @RequestMapping("calendarMain")
    public String calendarMain(Model model, HttpSession session) {
    	model.addAttribute("showSchedule", calendarService.showSchedule(spaceNo));
    	System.out.println(calendarService.showSchedule(spaceNo));
    	return "work/calendarMain";
    }
    
    @ResponseBody
    @PostMapping(value="addSchedule")
    public Map<Object,Object> addSchedule(@RequestBody CalendarVo vo) throws Exception{
    	Map<Object,Object> map = new HashMap<Object,Object>();
    	
    	vo.setSpaceMemberNo(spaceMemberNo);
    	vo.setSpaceNo(spaceNo);
    	calendarService.addSchedule(vo);
    	
    	return map;
    }
    
    @RequestMapping(value="calendarList")
    public String calendarList(Model model, HttpSession session) {
    	
    	model.addAttribute("schedule",calendarService.showSchedule(spaceNo));
    	
    	return "work/calendarList";
    }
    
    @RequestMapping(value="calendarDetail/{num}")
    public String calendarDetail(Model model, @PathVariable int num, HttpSession session) {
    	CalendarVo vo = calendarService.selectOne(num);
    	
    	model.addAttribute("schedule", vo);
    	
    	return "work/calendarDetail";
    }
    
}
