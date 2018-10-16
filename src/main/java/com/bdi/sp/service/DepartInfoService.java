package com.bdi.sp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bdi.sp.vo.DepartInfo;

@Service
public interface DepartInfoService {
	public List<DepartInfo> departinfoList(DepartInfo df);
	public DepartInfo departinfo(int dfno);
}
