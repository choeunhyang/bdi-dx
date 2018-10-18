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
	public Schola selectSchola(String scid,String scpwd) {
		Schola sc = new Schola();
		sc.setScid(scid);
		sc.setScpwd(scpwd);
		return ss.selectOne("com.bdi.sp.ScholaMapper.selectSchola",sc);
	}

	@Override
	public String insertSchola(Schola sch) {
		return ss.insert("com.bdi.sp.ScholaMapper.insertSchola",sch)+"";
	}

	@Override
	public String deleteSchola(String scid) {
		return ss.delete("com.bdi.sp.ScholaMapper.deleteSchola",scid)+"";
	}

	@Override
	public String updateSchola(Schola sch) {
		return ss.update("com.bdi.sp.ScholaMapper.updateSchola",sch)+"";
	}

}
