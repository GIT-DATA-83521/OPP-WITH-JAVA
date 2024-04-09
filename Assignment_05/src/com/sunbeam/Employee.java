package com.sunbeam;

import java.util.Scanner;

public abstract class Employee implements Acceptable , Printable{
	
	private String fname;
	private String lname;
	private int ssn;
	
	public Employee() {
		
	}

	public Employee(String fname, String lname, int ssn) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
	}
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter fname : ");
		fname= sc.next();
		
		System.out.println("Enter lname : ");
		lname= sc.next();
		
		System.out.println("Enter SSN : ");
		ssn=sc.nextInt();
	
	}
	
	@Override
	public void dispaly() {
		System.out.println("Fname : "+fname);
		System.out.println("Lname : "+lname);
		System.out.println("SSN : "+ssn);
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", ssn=" + ssn + "]";
	}

	public abstract double calculateTotalSal(); 
	

}
