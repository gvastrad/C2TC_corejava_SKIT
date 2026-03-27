package com.tnsif.inheritance.slinheritance;

public class Student extends Citizen {
	private int rollNo;
	private String collegeName;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(int rollNo, String collegeName) {
		super();
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	public Student(String name, String aadharNo, String address, long phno,int rollNo,String collegeName) {
		super(name, aadharNo, address, phno);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno()
				+ "]";
	}
	
}
