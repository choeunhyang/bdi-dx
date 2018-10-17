package com.bdi.sp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bdi.sp.vo.Schola;

@Repository
public interface ScholaDAO {
	public List<Schola> scholaList ();
	public Schola selectschola (String scid);
}
