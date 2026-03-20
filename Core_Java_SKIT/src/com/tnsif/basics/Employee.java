package com.tnsif.basics;

public class Employee {
	
private int eid;
private String name;
private float salary;
private char gender;

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}


public Employee(int eid, String name, float salary, char gender) {
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.gender = gender;
}


public Employee() {
	this.eid=10;
	this.name="ABC";
	this.salary=234455;
	this.gender='m';
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
}
}
