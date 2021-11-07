package com.work.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.BoardDao;
import com.work.dao.CalendarDao;
import com.work.dto.BoardVo;

@Service
public class CalendarServiceImpl implements CalendarService{
	
	@Autowired
	private CalendarDao calendarDao; 
	
	}
