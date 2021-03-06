package com.bdi.sp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bdi.sp.service.ScholaService;
import com.bdi.sp.vo.Japan;
import com.bdi.sp.vo.Schola;

@Controller
public class ScholaController {
	private static final Logger logger = LoggerFactory.getLogger(ScholaController.class);
	
	@Autowired
	public ScholaService scs;
	
	@RequestMapping(value="/schola",method=RequestMethod.GET)
	public @ResponseBody List<Schola> scholaList(@ModelAttribute Schola sc){
		return scs.scholaList(sc);
	}
	
	@RequestMapping(value="/schola/{scid}",method=RequestMethod.GET)
	public String selectschola2(Model mo,@PathVariable String scid){
		mo.addAttribute("sc",scs.selectSchola2(scid));
		return "schola/view";
	}
	
	@RequestMapping(value="/schola/{scid}/{scpwd}",method=RequestMethod.POST)
	public @ResponseBody Schola selectschola(@PathVariable String scid,@PathVariable String scpwd){
		return scs.selectSchola(scid, scpwd);
	}
	
	@RequestMapping(value="/schola",method=RequestMethod.POST)
	public @ResponseBody String insertschola(@RequestBody Schola s){
		logger.debug("Schola=>{}",s);
		return scs.insertSchola(s);
	}
	
	@RequestMapping(value="/schola/{scid}",method=RequestMethod.DELETE)
	public @ResponseBody String deleteschola(@RequestBody Schola s,@PathVariable String scid){
		logger.debug("Schola=>{}",s);
		return scs.deleteSchola(scid);
	}
	
	@RequestMapping(value="/schola/{scid}",method=RequestMethod.PUT)
	public @ResponseBody String updateschola(@RequestBody Schola s,@PathVariable String scid){
		logger.debug("Schola=>{}",s);
		return scs.updateSchola(s);
	}
}
