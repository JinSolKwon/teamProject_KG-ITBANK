package com.work.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
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

import com.work.dto.BoardVo;
import com.work.service.BoardService;

@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@RequestMapping("/work/*") // 모든맵핑은 /member/를 상속
public class BoardController {
	    // 로깅을 위한 변수
	    private static final Logger logger = LoggerFactory.getLogger(WorkController.class);
	    
//	    private static final String FILE_PATH ="d:\\javastudy\\jspupload";
	    private static final String FILE_PATH ="c:\\javastudy\\fileupload";
	    
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
	    	int writeMemberNo=boardService.selectMember(boardDetailNo);
	    	
			int spaceNo = 1;  //(int)session.getAttribute("spaceNo");
	    	int spaceMemberNo = 2;  //(int)session.getAttribute("spaceMemberNo");
	    	boolean writer = false; 
	    	
	    	if (writeMemberNo == spaceMemberNo) {
	    		writer = true;
	    	}
	    	model.addAttribute("article", boardService.read(boardDetailNo));
			model.addAttribute("pageNum", session.getAttribute("pageNum"));
			model.addAttribute("writer", writer);
			
			return "work/boardDetail";
		}
	    
		@RequestMapping(value="download/{boardDetailNo}")
		public void download(@PathVariable int boardDetailNo ,HttpServletResponse resp, HttpServletRequest req) {
			BoardVo vo = boardService.read(boardDetailNo);
			String filename = vo.getFileName();
			
			File downFile = new File(FILE_PATH + "\\"+ filename);
			
			if (downFile.exists() && downFile.isFile()) {
				try {
					filename = URLEncoder.encode(filename, "utf-8").replaceAll("\\+","%20");
					long filesize = downFile.length();
					
					resp.setContentType("application/octet-stream; charset=utf-8");
					resp.setContentLength((int) filesize);
					String strClient = req.getHeader("user-agent");
					
					if (strClient.indexOf("MSIE 5.5") != -1) {
						resp.setHeader("Content-Disposition", "filename="
	                            + filename + ";");
	                } else {
	                	resp.setHeader("Content-Disposition",
	                            "attachment; filename=" + filename + ";");
	                }
					resp.setHeader("Content-Length", String.valueOf(filesize));
					resp.setHeader("Content-Transfer-Encoding", "binary;");
					resp.setHeader("Pragma", "no-cache");
					resp.setHeader("Cache-Control", "private");
	 
	                byte b[] = new byte[1024];
	 
	                BufferedInputStream in = new BufferedInputStream(
	                        new FileInputStream(downFile));
	 
	                BufferedOutputStream out = new BufferedOutputStream(
	                		resp.getOutputStream());
	 
	                int read = 0;
	 
	                while ((read = in.read(b)) != -1) {
	                    out.write(b, 0, read);
	                }
	                out.flush();
	                out.close();
	                in.close();
					
				} catch (Exception e) {
					System.out.println("Download Exception : " + e.getMessage());
				}
			} else {
				System.out.println("Download Error : downFile Error [" + downFile + "]");
			}
			 
		}
	    
	    @GetMapping(value="boardWrite")
	    public String write(Model model,HttpSession session) {
	    	int pageNum=(int)session.getAttribute("pageNum");
	    	int spaceNo = 1;  //(int)session.getAttribute("spaceNo");
	    	int spaceMemberNo = 2;  //(int)session.getAttribute("spaceMemberNo");
	    	BoardVo article = new BoardVo();
	    	
	    	article.setSpaceNo(spaceNo);
	    	article.setSpaceMemberNo(spaceMemberNo);
	    	
	    	model.addAttribute("name", boardService.name(spaceMemberNo));
	    	model.addAttribute("article", article);
	    	model.addAttribute("pageNum",pageNum);
	    	
	    	return "work/boardWrite";
	    }
	    
	    @PostMapping(value="boardWrite")
		public String write(@RequestParam("file")MultipartFile file, @Valid BoardVo boardVo, BindingResult bindingResult,
			 HttpSession session) throws IllegalStateException, IOException{
	    	int spaceNo = 1;  //(int)session.getAttribute("spaceNo");
	    	int spaceMemberNo = 2;  //(int)session.getAttribute("spaceMemberNo");
	    	
	    	int pageNum = (int)session.getAttribute("pageNum");
	    	
	    	String fileName = file.getOriginalFilename();
			
	    	boardVo.setSpaceNo(spaceNo);
	    	boardVo.setSpaceMemberNo(spaceMemberNo);

			if(!file.getOriginalFilename().isEmpty()) {
				file.transferTo(new File(FILE_PATH, fileName));
				boardVo.setFileName(fileName); 
			} else {
				boardVo.setFileName("");
			}
			
			if(bindingResult.hasErrors()) {
				return "redirect:work/boardWrite"; 
			}
			boardService.write(boardVo);
			return "redirect:/work/boardMain?pageNum=1";
		}
	    
	    @GetMapping(value="boardDelete/{num}")
		public String delete(@PathVariable int num, Model model) {
	    	BoardVo vo=boardService.read(num);
	    	
	    	String name=boardService.name(boardService.read(num).getSpaceMemberNo());
	    	
			model.addAttribute("article", vo);
			model.addAttribute("name", name);
			return "work/boardDelete";
		}
		
		@PostMapping(value="boardDelete/{num}")
		public String delete(int num, String pwd, Model model, HttpSession req
				) {
			int pageNum = (int)req.getAttribute("pageNum");
			String pass=boardService.pass(num);
			if (!pass.equals(pwd)) {
				model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
				return "redirect:/work/boardDelete/"+num;
			} else {
				BoardVo vo = new BoardVo();
				vo.setBoardDetailNo(num);
			 
				String filename = boardService.read(num).getFileName();
			
				if(filename == null) {
					filename= "";
				}
			
				if (!filename.equals("")) {
					File dir = new File(FILE_PATH);
					File[] files = dir.listFiles();
					for (File f : files) {
						if (f.getName().equals(filename)) {
							f.delete();
						}
					}
				}
			
				boardService.delete(num);
			
				return "redirect:/work/boardMain?pageNum="+pageNum; 		
		}    
	}
	
		@GetMapping(value="boardUpdate/{num}")
		public String edit(@PathVariable int num, Model model, HttpSession session) {
			int pageNum = (int)session.getAttribute("pageNum");
			BoardVo vo = new BoardVo();
			vo = boardService.read(num);
			String name=boardService.name(boardService.read(num).getSpaceMemberNo());
			
			model.addAttribute("num", num);
			model.addAttribute("article", vo);
			model.addAttribute("pageNum",pageNum);
			model.addAttribute("name", name);
			return "work/boardUpdate";
		}		
			
		@PostMapping(value="boardUpdate/{num}")
		public String edit(@RequestParam("file")MultipartFile file, @Valid BoardVo vo, BindingResult result, 
				SessionStatus sessionStatus, Model model, HttpSession session, @PathVariable int num) throws IllegalStateException, IOException {
			
			System.out.println(vo);
			
			String fileName=file.getOriginalFilename();
			System.out.println(fileName);
			vo.setBoardDetailNo(num);
			
			if(!file.getOriginalFilename().isEmpty()) {
				file.transferTo(new File(FILE_PATH, fileName));
				vo.setFileName(fileName); 
			} else {
				vo.setFileName("");
			}
			if(result.hasErrors()) {
				return "/work/boardUpdate";
			} else {			 
				boardService.update(vo);
				sessionStatus.setComplete();   
				return "redirect:/work/boardDetail/"+ num; 
			}
		
		}
		
		@RequestMapping(value="deleteFile/{num}")
		public String deleteFile(Model model,@PathVariable int num) {
			String filename = boardService.read(num).getFileName();
			
			if(filename == null) {
				filename= "";
			}
		
			if (!filename.equals("")) {
				File dir = new File(FILE_PATH);
				File[] files = dir.listFiles();
				for (File f : files) {
					if (f.getName().equals(filename)) {
						f.delete();
					}
				}
			}
			
			int result = boardService.deleteFile(num);
			
			if (result != 0 ) {
				return "redirect:/work/boardUpdate/{num}";
			} else {
				model.addAttribute("msg", "삭제되지 않았습니다.");
				return "redirect:/work/boardUpdate/{num}";
			}
		}
}
