package com.work.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.work.dto.Room;

@Controller
public class MainController {
	
	List<Room> roomList = new ArrayList<Room>();
	static int room_no = 0;
	
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
	public @ResponseBody List<Room> createRoom(@RequestParam HashMap<Object, Object> params){
		String room_name = (String) params.get("room_name");
		if(room_name != null && !room_name.trim().equals("")) {
			Room room = new Room();
			room.setRoom_no(++room_no);
			room.setRoom_name(room_name);
			roomList.add(room);
		}
		return roomList;
	}

	/**
	 * 방 정보가져오기
	 * @param params
	 * @return
	 */
	@RequestMapping("/getRoom")
	public @ResponseBody List<Room> getRoom(@RequestParam HashMap<Object, Object> params){
		return roomList;
	}
	
	/**
	 * 채팅방
	 * @return
	 */
	@RequestMapping("/moveChating")
	public ModelAndView chating(@RequestParam HashMap<Object, Object> params) {
		ModelAndView mv = new ModelAndView();
		int room_no = Integer.parseInt((String) params.get("room_no"));
		
		List<Room> new_list = roomList.stream().filter(o->o.getRoom_no()==room_no).collect(Collectors.toList());
		if(new_list != null && new_list.size() > 0) {
			mv.addObject("room_name", params.get("room_name"));
			mv.addObject("room_no", params.get("room_no"));
			mv.setViewName("chat");
		}else {
			mv.setViewName("room");
		}
		return mv;
	}
	
	@RequestMapping(value = "/upload")
	public ModelAndView uploadProcess(@RequestParam HashMap<Object, Object> params) {
		ModelAndView mv = new ModelAndView();
		List<Room> new_list = roomList.stream().filter(o->o.getRoom_no()==room_no).collect(Collectors.toList());
		if(new_list != null && new_list.size() > 0) {
			mv.addObject("room_no", params.get("room_no"));
			mv.addObject("userName", params.get("userName"));
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