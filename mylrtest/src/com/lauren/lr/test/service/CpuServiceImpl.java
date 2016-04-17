package com.lauren.lr.test.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lauren.lr.test.dao.CpuDao;
import com.lauren.lr.test.dao.CpuDaoImpl;
import com.lauren.lr.test.entity.Cpu;


public class CpuServiceImpl implements CpuService {
	@Autowired
	private CpuDao cpuDao;
	
	@Override
	public void updateService(int id, Map<String, Object> params) {
		cpuDao.updateCpu(id, params);
	}

	@Override
	public void insertSerice(Cpu cpu) {
		cpuDao.insertSingleCpuObj(cpu);
	}

	@Override
	public void deleteService(Cpu cpu) {
		cpuDao.deleteSingleCpuObj(cpu);
	}
	
	@Autowired
	public void setCpuDao(CpuDao cpuDao)
	{
		this.cpuDao = cpuDao;
	}

}
