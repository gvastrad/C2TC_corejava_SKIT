package com.tnsif.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the eid");
		emp.setEid(sc.nextInt());
		System.out.println("Enter the ename");
		emp.setName(sc.next());
		System.out.println("Enter the salary");
		emp.setSalary(sc.nextFloat());
		
		System.out.println(emp);
	}

}
