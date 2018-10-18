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
	public Schola selectSchola(String scid, String scpwd) {
		return sdao.selectSchola(scid);
	}

	@Override
	public String insertSchola(Schola sch) {
		return sdao.insertSchola(sch);
	}

	@Override
	public String deleteSchola(String scid) {
		return sdao.deleteSchola(scid);
	}

	@Override
	public String updateSchola(Schola sch) {
		return sdao.updateSchola(sch);
	}

}
