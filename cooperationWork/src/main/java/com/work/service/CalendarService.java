package com.work.service;

import java.util.List;

import com.work.dto.BoardVo;
import com.work.dto.CalendarVo;

public interface CalendarService {
	public abstract List<CalendarVo> showSchedule(int spaceNo);
	
	public abstract void addSchedule(CalendarVo vo);
}
