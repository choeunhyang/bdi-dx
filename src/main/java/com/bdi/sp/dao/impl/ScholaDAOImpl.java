package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.ScholaDAO;
import com.bdi.sp.vo.Schola;

@Repository
public class ScholaDAOImpl implements ScholaDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Schola> scholaList() {
		return ss.selectList("com.bdi.sp.ScholaMapping.ScholaList");
	}

	@Override
	public Schola selectschola(int scnum) {
		return null;
	}

}
