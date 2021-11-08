package com.work.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.BoardDao;
import com.work.dao.CalendarDao;
import com.work.dto.BoardVo;
import com.work.dto.CalendarVo;

@Service
public class CalendarServiceImpl implements CalendarService{
	
	@Autowired
	private CalendarDao calendarDao; 
	
	@Override
	public void addSchedule(CalendarVo vo) {
		calendarDao.addSchedule(vo);
	}
	
	@Override
	public List<CalendarVo> showSchedule(int spaceNo) {
		return calendarDao.showSchedule(spaceNo);
	}
	
	@Override
	public CalendarVo selectOne(int fcDetailNo) {
		return calendarDao.selectOneCalendar(fcDetailNo);
	}
}
