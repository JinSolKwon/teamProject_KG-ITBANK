package com.work.dto.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.work.dto.dao.ChatDAOImpl;
import com.work.dto.service.ChatService;
import com.work.dto.vo.*;

@Controller
public class MainController {
	
	List<PChatRoom> ProomList = new ArrayList<PChatRoom>();
	List<GChatRoom> GroomList;	
	static int pchatroomno = 0;
	static int gchatroomno = 0;
	
	int spaceno = 1;
	
	@Autowired
	private ChatService service;
	
	@RequestMapping("/chat")
	public ModelAndView chat() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("chat");
		return mv;
	}
	
	/**
	 * 방 페이지
	 * @return
	 */
	@RequestMapping("/room")
	public ModelAndView room() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("room");
		return mv;
	}
	

	/**
	 * 방 생성하기
	 * @param params
	 * @return
	 */
	@RequestMapping("/createRoom")
	public @ResponseBody List<GChatRoom> createRoom(@RequestParam HashMap<Object, Object> params){
		String roomname = (String) params.get("roomname");
		if(roomname != null && !roomname.trim().equals("")) {
			GChatRoom room = new GChatRoom();
			room.setGchatroomno(++gchatroomno);
			room.setRoomname(roomname);
			GroomList.add(room);
			
			System.out.println(room);
			
			
		}
		return GroomList;
	}
	

	/**
	 * 방 정보가져오기
	 * @param params
	 * @return
	 */
	@RequestMapping("/getGRoom")
	public @ResponseBody List<GChatRoom> getGRoom(@RequestParam HashMap<Object, Object> params) throws Exception {
		GroomList = service.selectGRoom(spaceno);
		return GroomList;
	}
	
	@RequestMapping("/getPRoom")
	public @ResponseBody List<PChatRoom> getPRoom(@RequestParam HashMap<Object, Object> params) throws Exception {
		ProomList = service.selectPRoom(spaceno);
		return ProomList;
	}
	
	/**
	 * 채팅방
	 * @return
	 */
	@RequestMapping("/moveChating")
	public ModelAndView chating(@RequestParam HashMap<Object, Object> params) {
		ModelAndView mv = new ModelAndView();
		int roomno = Integer.parseInt((String) params.get("roomno"));
		
		List<GChatRoom> new_list = GroomList.stream().filter(o->o.getGchatroomno()==roomno).collect(Collectors.toList());
		if(new_list != null && new_list.size() > 0) {
			mv.addObject("roomname", params.get("roomname"));
			mv.addObject("roomno", params.get("roomno"));
			mv.setViewName("chat");
		}else {
			mv.setViewName("room");
		}
		return mv;
	}
	
	@RequestMapping(value = "/upload")
	public ModelAndView uploadProcess(@RequestParam HashMap<Object, Object> params) {
		ModelAndView mv = new ModelAndView();
		List<GChatRoom> new_list = GroomList.stream().filter(o->o.getGchatroomno()==gchatroomno).collect(Collectors.toList());
		if(new_list != null && new_list.size() > 0) {
			mv.addObject("roomno", params.get("roomno"));
			mv.addObject("username", params.get("username"));
			mv.setViewName("upload");
		}else {
			mv.setViewName("room");
		}
		return mv;
	}
	
	@RequestMapping(value = "/download")
	public ModelAndView downloadProcess(@RequestParam HashMap<Object, Object> params) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("download");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
}