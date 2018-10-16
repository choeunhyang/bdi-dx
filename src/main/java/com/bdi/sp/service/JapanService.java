package com.bdi.sp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bdi.sp.vo.Japan;
@Service
public interface JapanService {
//	public String JapanList();
	public List<Japan> JapanList(Japan j);
	public Japan getJapan(int jpnum);
	public int insertJapan(Japan jp);
	public int updateJapan(Japan jp);
	public int deleteJapan(Integer jpnum);
}
