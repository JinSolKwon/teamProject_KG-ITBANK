package com.work.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
   	
    	model.addAttribute("toDo", toDo);
    	model.addAttribute("progress", progress);
    	model.addAttribute("done", done);
    	
    	
    	return "work/kanbanMain";
    }
	   //지우려했는데 혹시 몰라서 남겨둠
//    @GetMapping(value="kanbanWrite")
//    public String kanbanWrite(Model model, HttpSession session) {
//    	KanbanVo vo = new KanbanVo();
//    	vo.setSpaceNo(spaceNo);
//    	vo.setSpaceMemberNo(spaceMemberNo);
//    	
//    	model.addAttribute("vo", vo);
//    		
//    	return null;
//    }
    
    @PostMapping(value="kanbanWrite")
    public String kanbanWriteAc(Model model, @Valid KanbanVo vo, HttpSession session) {
    	vo.setSpaceNo(spaceNo);
    	vo.setSpaceMemberNo(spaceMemberNo);
    	
    	System.out.println(vo);
    	
    	kanbanService.insertKanban(vo);
    		
    	return "redirect:/work/kanbanMain";
    }
    
    @GetMapping(value="kanbanWritePopup")
    public String kanbanWritePopup(Model model, HttpSession session) {
    	List<KanbanVo> nameList= null;
    	nameList = kanbanService.nameList(spaceNo);
    	
    	model.addAttribute("nameList", nameList);
    	
    	return "work/kanbanWritePopup";
    }
    
    @RequestMapping(value="kanbanDetailPopup/{num}")
    public String kanbanDetail(Model model, @PathVariable("num") int num, HttpSession session) {
    	KanbanVo vo = kanbanService.selectOne(num);
    	
    	model.addAttribute("kanban",vo);
    	
    	return "work/kanbanDetailPopup";
    }
    
    @GetMapping(value="kanbanUpdate/{num}")
    public String kanbanUpdatePopup(Model model, @PathVariable int num, HttpSession session) {
    	List<KanbanVo> nameList= null;
    	nameList = kanbanService.nameList(spaceNo);
    	KanbanVo vo = kanbanService.selectOne(num);
    	
    	model.addAttribute("nameList", nameList);
    	model.addAttribute("kanban", vo);
    	
    	return "work/kanbanUpdate";
    }
    
    @PostMapping(value="kanbanUpdate/{num}")
    public String kanbanUpdatePopup(Model model, @Valid KanbanVo vo,@PathVariable int num, HttpSession session){
    	vo.setKanbanDetailNo(num);
    	vo.setSpaceNo(spaceNo);
    	
    	kanbanService.updateKanban(vo);
    	System.out.println(vo);
 
    	return "redirect:/work/kanbanMain";
    }
    
    @GetMapping(value="kanbanDelete/{num}")
    public String kanbanDeletePopup(Model model, @PathVariable int num, HttpSession session) {
    	KanbanVo vo = kanbanService.selectOne(num);
    	
    	model.addAttribute("kanban",vo);
    	
    	return "work/kanbanDelete";
    }
    
    @PostMapping(value="kanbanDelete/{num}")
    public String kanbanDeletePopup(Model model, @RequestParam("pwd") String pwd, @PathVariable int num, HttpSession session) {

    	String pass = kanbanService.pass(num);
    	
    	if (!pass.equals(pwd)) {
    		model.addAttribute("msg","비밀번호가 일치하지 않습니다.");
    		return "redirect:/work/kanbanDelete/"+num;
    	} 
    	
    	kanbanService.deleteKanban(num);
    	
    	return "redirect:/work/kanbanDeleteAc";
    }
    
    @GetMapping(value="kanbanDeleteAc")
    public String kanbanDeleteAcPopup(Model model, HttpSession session) {
    	
    	return "work/kanbanDeleteAc";
    }
    
    @PostMapping(value="kanbanDeleteAc")
    public String kanbanDeleteAcPopup(Model model) {
    	
    	return "redirect:/work/kanbanMain";
    }
}
