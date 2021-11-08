package com.work.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class InviteUtils {
	public List<Map<String, Object>> inviteList(InviteVO vo,int spaceInfo, int memberInfo){
		System.out.println("유틸 실행");
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> listMap = null;
		
		for(int i=0; i<vo.getId().size(); i++) {
			listMap = new HashMap<String, Object>();
			listMap.put("id", vo.getId().get(i));
			listMap.put("spaceNo", spaceInfo);
			listMap.put("memberNo", memberInfo);
			list.add(listMap);
		}
		System.out.println(list);
		return list;
	}

}
