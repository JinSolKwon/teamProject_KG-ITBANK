package com.work.dao;

import java.util.HashMap;
import java.util.List;

import com.work.dto.CalendarVo;

public interface CalendarDao {
	// 스케쥴 목록 리스트 가져오기
	public abstract List<CalendarVo> showSchedule(int spaceNo);
	
	// 스케쥴 추가하기
	public abstract void addSchedule(CalendarVo vo);
	
	// 스케쥴 1개 가져오기
	public abstract CalendarVo selectOneCalendar(int fcDetailNo);
}
