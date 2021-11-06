package com.work.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.work.dto.KanbanVo;
import com.work.service.KanbanService;

@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@RequestMapping("/work/*") // 모든맵핑은 /member/를 상속
public class KanbanController {
    // 로깅을 위한 변수
    private static final Logger logger = LoggerFactory.getLogger(WorkController.class);
	    
    private static int spaceNo=1;
    private static int spaceMemberNo=2;
    
    @Inject
    KanbanService kanbanService;
    
    @RequestMapping("kanbanMain")
	public String list(Model model, HttpSession session) {
    	List<KanbanVo> toDo= null;
    	List<KanbanVo> progress= null;
    	List<KanbanVo> done= null;
    	
//    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm");
//    	for(KanbanVo vo : toDo) {
//			System.out.println(simpleDateFormat.format(vo.getCreateDate()));
//		}
    	
    	toDo = kanbanService.toDoList(spaceNo);
    	progress = kanbanService.progressList(spaceNo);
    	done = kanbanService.doneList(spaceNo);
    	
    	System.out.println(toDo);
    	System.out.println(progress);
    	System.out.println(done);
    	
    	model.addAttribute("toDo", toDo);
    	model.addAttribute("progress", progress);
    	model.addAttribute("done", done);
    	
    	return "work/kanbanMain";
    }
	    
    @GetMapping(value="kanbanWrite")
    public String kanbanWrite(Model model, HttpSession session) {
    	KanbanVo vo = new KanbanVo();
    	vo.setSpaceNo(spaceNo);
    	vo.setSpaceMemberNo(spaceMemberNo);
    	
    	model.addAttribute("vo", vo);
    		
    	return null;
    }
    
    @GetMapping("kanbanWritePopup")
    public String kanbanWritePopup() {
    	return "work/kanbanWritePopup";
    }
    
    @PostMapping("kanbanWritePopup")
    public String kanbanAddPopup() {
    	return "work/kanbanWritePopup";
    }
}
