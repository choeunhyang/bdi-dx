package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.DepartInfoDAO;
import com.bdi.sp.service.DepartInfoService;
import com.bdi.sp.vo.DepartInfo;

@Service
public class DepartInfoServiceImpl implements DepartInfoService {

	@Autowired
	public DepartInfoDAO ddao;
	
	@Override
	public List<DepartInfo> departinfoList(DepartInfo df) {
		return ddao.departinfoList(df);
	}

	@Override
	public DepartInfo departinfo(int dfno) {
		return ddao.departinfo(dfno);
	}

}
