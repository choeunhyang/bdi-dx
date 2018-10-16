package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.JapanDAO;
import com.bdi.sp.service.JapanService;
import com.bdi.sp.vo.Japan;

@Service
public class JapanServiceImpl implements JapanService {

	@Autowired
	private JapanDAO jdao;
	
	/*@Override
	public String JapanList() {
		return jdao.JapanList();
	}*/
	
	@Override
	public List<Japan> JapanList(Japan j) {
		return jdao.JapanList();
	}

	@Override
	public Japan getJapan(int jpnum) {
		return jdao.getJapan(jpnum);
	}
	@Override
	public int insertJapan(Japan jp) {
		return jdao.insertJapan(jp);
	}

	@Override
	public int updateJapan(Japan jp) {
		return jdao.updateJapan(jp);
	}

	@Override
	public int deleteJapan(Integer jpnum) {
		return jdao.deleteJapan(jpnum);
	}

	

}
