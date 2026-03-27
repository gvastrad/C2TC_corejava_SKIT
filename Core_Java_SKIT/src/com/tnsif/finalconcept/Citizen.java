package com.tnsif.finalconcept;

public final class Citizen {
	String name;
	final static String countryName="India";
	
	public  Citizen(String name) {
		this.name = name;
	}

	void m1() {
		System.out.println("In method 1");
	}
	
	final void m2() {
		System.out.println("In method 2");
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name  +"country ="+countryName +"]";
	}

	
	
}
