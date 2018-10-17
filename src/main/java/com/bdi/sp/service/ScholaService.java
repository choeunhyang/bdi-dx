package com.bdi.sp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bdi.sp.vo.Schola;

@Service
public interface ScholaService {
	public List<Schola> scholaList (Schola sc);
	public Schola selectSchola (String scid);
	public String insertSchola (String scid);
	public String deleteSchola (String scid);
	public String updateSchola (String scid);
}
