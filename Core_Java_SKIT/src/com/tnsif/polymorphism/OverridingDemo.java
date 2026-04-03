package com.tnsif.polymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		//tight coupling/static binding
		HDFC obj=new HDFC();
		System.out.println(obj.getRateOfInterest());;
		
		//loose coupling
		RBI ref=new SBI();
		System.out.println(ref.getRateOfInterest());

	}

}
