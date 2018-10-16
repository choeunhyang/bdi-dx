package com.bdi.sp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bdi.sp.vo.DepartInfo;

@Repository
public interface DepartInfoDAO {
	public List<DepartInfo> departinfoList(DepartInfo df);
	public DepartInfo departinfo(int dfno);
}
