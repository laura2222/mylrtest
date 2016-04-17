package com.lauren.lr.test.dao;

import java.util.Map;

import com.lauren.lr.test.entity.Cpu;

public interface CpuDao {
	public void updateCpu(final int id,final Map<String, Object> params);
	public void updateCpuByHQL(final int id ,final Map<String, Object> params);
	public void insertSingleCpuObj(final Cpu cpu);
	public void deleteSingleCpuObj(final Cpu cpu);
}
