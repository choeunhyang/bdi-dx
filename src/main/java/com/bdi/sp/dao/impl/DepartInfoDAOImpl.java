package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.DepartInfoDAO;
import com.bdi.sp.vo.DepartInfo;

@Repository
public class DepartInfoDAOImpl implements DepartInfoDAO {

	@Autowired
	public SqlSession ss;
	
	@Override
	public List<DepartInfo> departinfoList(DepartInfo df) {
		return ss.selectList("com.bdi.sp.DepartMapper.selectDepartList");
	}

	@Override
	public DepartInfo departinfo(int dfno) {
		return ss.selectOne("com.bdi.sp.DepartMapper.selectDepart",dfno);
	}

}
