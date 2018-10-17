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
		return ss.selectList("com.bdi.sp.ScholaMapper.ScholaList");
	}

	@Override
	public Schola selectSchola(String scid) {
		return ss.selectOne("com.bdi.sp.ScholaMapper.selectSchola",scid);
	}

	@Override
	public String insertSchola(Schola sc) {
		return ss.insert("com.bdi.sp.ScholaMapper.insertSchola",sc)+"";
	}

	@Override
	public String deleteSchola(String scid) {
		return ss.delete("com.bdi.sp.ScholaMapper.insertSchola",scid)+"";
	}

	@Override
	public String updateSchola(Schola sc) {
		return ss.update("com.bdi.sp.ScholaMapper.insertSchola",sc)+"";
	}

}
