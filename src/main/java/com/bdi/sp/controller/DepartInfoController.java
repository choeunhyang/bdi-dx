package com.bdi.sp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.DepartInfoService;
import com.bdi.sp.vo.DepartInfo;

@Controller
public class DepartInfoController {
	private static final Logger logger = LoggerFactory.getLogger(DepartInfoController.class);
	
	@Autowired
	private DepartInfoService dis;
	
	@RequestMapping(value="/depart", method=RequestMethod.GET)
	public @ResponseBody List<DepartInfo> selectList(@ModelAttribute DepartInfo df){
		return dis.departinfoList(df);
	}
	
	@RequestMapping(value="/depart/{dino}", method=RequestMethod.GET)
	public @ResponseBody DepartInfo selectDepart(@PathVariable int dfno) {
		return dis.departinfo(dfno);
	}
	
}
