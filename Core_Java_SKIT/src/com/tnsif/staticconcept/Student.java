package com.tnsif.staticconcept;

public class Student {
private int id;
private String name;
private static String collegeName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static String getCollegeName() {
	return collegeName;
}
public static void setCollegeName(String collegeName) {
	Student.collegeName = collegeName;
}

public Student() {
}
public  Student(int id, String name) {
	this.id = id;
	this.name = name;
}
 static void display() {
	// System.out.println(id);
 }
 static {
	System.out.println("StaticBock1"); 
 }
 static {
	System.out.println("StaticBock2"); 
 }

}
