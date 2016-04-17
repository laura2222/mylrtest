package com.lauren.lr.test.service;

import java.util.Map;
import com.lauren.lr.test.entity.Cpu;

public interface CpuService {
	public void updateService(int id,Map<String, Object> params);
	public void insertSerice(final Cpu cpu);
	public void deleteService(final Cpu cpu);
	
}
