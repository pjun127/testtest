package com.kh.spring.demo.model.dao;

import java.util.List;

import com.kh.spring.demo.model.vo.Dev;

public interface DemoDao {
	
	int insertDev(Dev dev);
	List<Dev> selectDemoList();
	Dev selectOne(int devNo);
	int updateDevEnd(Dev dev);
	int deleteDev(int devNo);
}
