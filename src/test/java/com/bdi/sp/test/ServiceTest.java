package com.bdi.sp.test;

import org.springframework.stereotype.Service;

@Service
public class ServiceTest {
	public String strTest(String str) {
		return str + "abc";
	}
	
	public Integer intTest(Integer i) {
		return i+1;
	}
}
