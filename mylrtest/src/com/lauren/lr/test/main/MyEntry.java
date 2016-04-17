package com.lauren.lr.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lauren.lr.test.entity.Cpu;
import com.lauren.lr.test.service.CpuService;
public class MyEntry {
	public static void main(String[] args) {
		ApplicationContext appCtx =  new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		CpuService service = (CpuService) appCtx.getBean("cpuService");
		Cpu cpu  = new Cpu();
		cpu.setCpuNameString("Intel Core i7 4970k");
		cpu.setBusSpeed("100MHz");
		cpu.setMultiplier("15-40");
		cpu.setL1Cache("4*64 KBytes");
		cpu.setL2Cache("4*64 KBytes");
		service.insertSerice(cpu);
		
	}
}
