package com.tnsif.inheritance.slinheritance;

public class Citizen {
	private String name;
	private String aadharNo;
	private String address;
	private long phno;
	
	public String getName() {
		return name;
	}
	public String getAadharNo() {
		return aadharNo;
	}	
	public String getAddress() {
		return address;
	}
	public long getPhno() {
		return phno;
	}
	public Citizen() {
		super();
	}
	public Citizen(String name, String aadharNo, String address, long phno) {
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
	}
	}
