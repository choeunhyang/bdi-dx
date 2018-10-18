package com.bdi.sp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bdi.sp.vo.Schola;

@Repository
public interface ScholaDAO {
	public List<Schola> scholaList ();
	public Schola selectSchola (String scid,String scpwd);
	public String insertSchola (Schola sch);
	public String deleteSchola (String scid);
	public String updateSchola (Schola sch);
}
