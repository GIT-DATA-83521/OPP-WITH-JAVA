package com.sunbeam;

import java.util.Scanner;

public class SalariedEmployee extends Employee{
	private double weekSal;

	public SalariedEmployee() {
		
	}

	public SalariedEmployee(double weekSal) {
		
		this.weekSal = weekSal;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Week Salary : ");
		weekSal=sc.nextDouble();
		}
	
	@Override
	public void dispaly() {
		super.dispaly();
		System.out.println("Week Salary : "+weekSal);
	}

	@Override
	public double calculateTotalSal() {
		return weekSal;
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weekSal=" + weekSal + ", toString()=" + super.toString() + calculateTotalSal() +"]";
	}
	
	
	
	
	
}
