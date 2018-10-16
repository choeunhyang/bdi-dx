package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.Japan;

public interface JapanDAO {
	public List<Japan> JapanList();
	public Japan getJapan(int jpnum);
	public int insertJapan(Japan jpnum);
	public int updateJapan(Japan jpnum);
	public int deleteJapan(Integer jpnum);
}
