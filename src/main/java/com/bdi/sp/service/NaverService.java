package com.bdi.sp.service;

import com.bdi.sp.vo.Naver;

public interface NaverService {
	public Naver getTrans(String text, String source, String target);
}
