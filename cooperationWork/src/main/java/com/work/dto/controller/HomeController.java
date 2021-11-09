package com.work.dto.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.dto.dao.ChatDAOImpl;
import com.work.dto.service.ChatService;
import com.work.dto.vo.GChatRoom;
import com.work.dto.vo.GChatRoomMember;
import com.work.dto.vo.PChatRoom;
import com.work.dto.vo.PChatRoomMember;
import com.work.dto.vo.TestBean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ChatService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		
		//스페이스 넘버가 미리 주어졌다고 생각
		int spaceno = 1;
		
		
		//인원수 5명
		int member = 5;
		
		//권진솔 no=1,서찬기no=2,서현진no=3,강을원no=4,구병희no=5
		
		
		//생성해야하는 1:1 채팅방 갯수
		int membersum = 0;
		
		//생성해야하는 1:1 채팅방 갯수 확인
		for(int i = 0 ; i < member ; i++) {
			membersum += i;
		}
		
		//1:1 채팅방 생성
		for(int i = 0;i<membersum;i++) {
//				service.insertPRoom(spaceno);
		}
		
		List<Integer> pchatroonoList = new ArrayList<>();
		
		
		//리스트 받아옴
		List<PChatRoom> pchatroomList = service.selectPRoom(spaceno);
		
		for(int i = 0; i<pchatroomList.size(); i++) {
			System.out.println(pchatroomList.get(i));
			
			//개인채팅방을 지정해주기 위해 PCHAT_ROOM_NO를 가져온다.
			pchatroonoList.add(pchatroomList.get(i).getPchatroomno());
		}
		
		PChatRoomMember pcrm = new PChatRoomMember();
		// ***a번째 채팅방
		int a=1;
		// ***b번째 사람
		int b=1;
		// ***c번째 사람
		int c=5;
		
		System.out.println(pchatroonoList.size());
		
//		for(; a <=pchatroonoList.size();) {
//			System.out.println(a+" and"+ b);
//			pcrm.setPchatroomno(a);
//			pcrm.setSpacememberno(b);
//			
//			System.out.println(pcrm);
//			service.insertPRoomMember(pcrm);
//			
//			System.out.println(a+" and"+ c);
//			pcrm.setPchatroomno(a);
//			pcrm.setSpacememberno(c);
//			service.insertPRoomMember(pcrm);
//			c--;
//			
//			if(c==b) {
//				b++;
//				c=member;
//			}
//			a++;
//		}
		
		
		
		// 단체채팅방을 생성하기 위해 파라미터로 쓰일 GChatRoom생성
		GChatRoom gcr = new GChatRoom();
		// 스페이스 넘버를 받아옴 
		gcr.setSpaceno(spaceno);
		gcr.setRoomname("전체 채팅방");
		
		//초기 전체 채팅방 생성
//		service.insertGRoom(gcr);
		
		List<GChatRoom> gchatroomList = service.selectGRoom(spaceno);
		System.out.println(gchatroomList.get(0));

		GChatRoomMember gcrm = new GChatRoomMember();
		//i번째 사람 초기 단체 인원 삽입
//		for(int i = 1; i<= member ;i++) {
//			gcrm.setGchatroomno(gchatroomList.get(0).getGchatroomno());
//			gcrm.setSpacememberno(i);
//
//			System.out.println(gcrm);
//			service.insertGRoomMember(gcrm);
//		}
		
		
		gchatroomList = service.selectGRoom(spaceno);
		System.out.println(gchatroomList.get(0));
		return "home";
	}
	
}
