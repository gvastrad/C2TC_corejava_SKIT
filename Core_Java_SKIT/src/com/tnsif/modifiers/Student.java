package com.tnsif.modifiers;

public class Student {
   private int sid;
	static protected String sname;
	String address;
	float percentage;
	public char gender;
	
	void display() {
		System.out.println("Student id is "+sid+"Student name is"+sname+"Student adress is"+address+percentage+gender);
	}
}
