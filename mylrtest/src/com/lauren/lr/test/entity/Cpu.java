package com.lauren.lr.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cpu_t")
public class Cpu {
	private int  id;
	private String cpuNameString;
	private String coreSpeed;
	private String multiplier;
	private String busSpeed;
	private String l1Cache;
	private String l2Cache;
	private String l3Cache;
	private String instruction;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="cpu_name")
	public String getCpuNameString() {
		return cpuNameString;
	}
	
	public void setCpuNameString(String cpuNameString) {
		this.cpuNameString = cpuNameString;
	}
	
	@Column(name="core_speed")
	public String getCoreSpeed() {
		return coreSpeed;
	}
	
	public void setCoreSpeed(String coreSpeed) {
		this.coreSpeed = coreSpeed;
	}
	
	@Column(name="multiplier")
	public String getMultiplier() {
		return multiplier;
	}
	
	public void setMultiplier(String multiplier) {
		this.multiplier = multiplier;
	}
	
	@Column(name="bus_speed")
	public String getBusSpeed() {
		return busSpeed;
	}
	
	public void setBusSpeed(String busSpeed) {
		this.busSpeed = busSpeed;
	}
	
	@Column(name="l1_cache")
	public String getL1Cache() {
		return l1Cache;
	}
	
	public void setL1Cache(String l1Cache) {
		this.l1Cache = l1Cache;
	}
	
	@Column(name="l2_cache")
	public String getL2Cache() {
		return l2Cache;
	}
	
	public void setL2Cache(String l2Cache) {
		this.l2Cache = l2Cache;
	}
	
	@Column(name="l3_cache")
	public String getL3Cache() {
		return l3Cache;
	}
	public void setL3Cache(String l3Cache) {
		this.l3Cache = l3Cache;
	}
	
	@Column(name="instruction")
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
		
}
