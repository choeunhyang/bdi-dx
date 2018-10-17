package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.ScholaService;
import com.bdi.sp.vo.Schola;

@Controller
public class ScholaController {
	@Autowired
	public ScholaService scs;
	
	@RequestMapping(value="/schola",method=RequestMethod.GET)
	public @ResponseBody List<Schola> scholaList(@ModelAttribute Schola sc){
		return scs.scholaList(sc);
	}
	
	@RequestMapping(value="/schola/{scid}",method=RequestMethod.GET)
	public @ResponseBody Schola selectschola(@PathVariable String scid){
		return scs.selectschola(scid);
	}
}
