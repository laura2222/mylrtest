package com.lauren.lr.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lauren.lr.test.entity.Cpu;
import com.lauren.lr.test.service.CpuService;


@Controller
@RequestMapping("/cpu")
public class CpuContrl {
	@Autowired
	private CpuService cpuService;
	
	@RequestMapping(value = "/create.do")
	public String createCpu(Cpu cpu) {
		cpuService.insertSerice(cpu);
		return "success";
	}

	public void setCpuService(CpuService cpuService) {
		this.cpuService = cpuService;
	}
	
	
}
