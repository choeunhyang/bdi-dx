package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.ScholaDAO;
import com.bdi.sp.service.ScholaService;
import com.bdi.sp.vo.Schola;

@Service
public class ScholaServiceImpl implements ScholaService {

	@Autowired
	private ScholaDAO sdao;
	
	@Override
	public List<Schola> scholaList(Schola sc) {
		return sdao.scholaList();
	}

	@Override
	public Schola selectschola(int scnum) {
		return sdao.selectschola(scnum);
	}

}
