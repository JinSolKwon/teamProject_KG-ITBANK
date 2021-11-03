package com.work.controller;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.work.dto.BoardVo;
import com.work.service.BoardService;

@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@RequestMapping("/work/*") // 모든맵핑은 /member/를 상속
public class BoardController {
	    // 로깅을 위한 변수
	    private static final Logger logger = LoggerFactory.getLogger(WorkController.class);
	    
	    @Inject
	    BoardService boardService;
	    
	    @RequestMapping("boardMain")
		public String list(@RequestParam(name="pageNum", required=false, defaultValue="0")int pageNum ,
				Model model, HttpSession session) {
	    	int spaceNo = 1;  //(int)session.getAttribute("spaceNo");
	    	int spaceMemberNo = 2;  //(int)session.getAttribute("spaceMemberNo");
	    	
	    	if (pageNum == 0) {
	    		pageNum = 1; 
	    		}
	    		int pageSize = 10; //한 페이지당 글의 개수
	    		int currentPage = pageNum;
	    		// 페이지의 시작 글 번호
	    		
	    		int startRow = (currentPage - 1) * pageSize + 1;
	    		int endRow = currentPage * pageSize;	//한 페이지의 마지막 글  번호
	    		int count = 0;
	    		int number = 0;
	    		List<BoardVo> articleList = null;
	    		count = boardService.articleCount(spaceNo);	// 전체 글 개수
	    		if(count > 0) {
	    			articleList = boardService.list(spaceNo, spaceMemberNo, startRow, endRow);
	    		} else { 
	    			articleList = Collections.emptyList();
	    		}
	    		number = count - (currentPage - 1) * pageSize;	//글 목록에 표시할 글 번호
	    		
	    		System.out.println(articleList);
	    		
	    		model.addAttribute("currentPage",new Integer(currentPage));
	    		model.addAttribute("startRow",new Integer(startRow));
	    		model.addAttribute("endRow",new Integer(endRow));
	    		model.addAttribute("count",new Integer(count));
	    		model.addAttribute("pageSize",new Integer(pageSize)); 
	    		model.addAttribute("number",new Integer(number));
	    		model.addAttribute("articleList",articleList);
	    	
	    		session.setAttribute("pageNum", pageNum);
	    	
	    		return "work/boardMain";
	    }
	    
	    @RequestMapping("boardDetail/{boardDetailNo}")
		public String read(Model model, @PathVariable int boardDetailNo, HttpSession session) {
			model.addAttribute("article", boardService.read(boardDetailNo));
			model.addAttribute("pageNum", session.getAttribute("pageNum"));
			
			return "work/boardDetail";
		}
	    
	    @GetMapping(value="boardWrite")
	    public String write(Model model,HttpSession session) {
	    
	    	return "work/boardWrite";
	    }
}
