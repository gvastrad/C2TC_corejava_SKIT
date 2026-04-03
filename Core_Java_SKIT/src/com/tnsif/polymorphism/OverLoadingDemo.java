package com.tnsif.polymorphism;

public class OverLoadingDemo {

	public static void main(String[] args) {

		System.out.println("------------------------ Constructor Overloading -----------------------");
		
		Point p = new Point(); //default constructor invoked
		System.out.println(p);
		
		Point p1 = new Point(10); 
		System.out.println(p1);
		
		System.out.println("------------------------ Method Overloading -----------------------");

		System.out.println(MEthodOverloadingDemo.addition(10,10));

		System.out.println(MEthodOverloadingDemo.addition("Ind","ia"));
		
	}

}
