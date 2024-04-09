package com.sunbeam;

import java.util.Scanner;

public class HourlySalary extends Employee {
	
	private double wage; // per hour price
	private double hours;
	private double hourSal;
	
	public HourlySalary() {
		
	}
	public HourlySalary(double wage, double hours) {
	
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public void accept(Scanner sc) {

		super.accept(sc);
		System.out.println("Enter Wages : ");
		wage = sc.nextDouble();
	
		System.out.println("Enter Hours : ");
		hours = sc.nextDouble();
	
	
	}
	
	@Override
	public void dispaly() {
	
		super.dispaly();
		System.out.println(" Hourly Wages are : "+hours*wage);	
	}
	
	
	
	@Override
	public String toString() {
		return "HourlySalary [wage=" + wage + ", hours=" + hours + ", hourSal=" + hourSal + ", toString()="
				+ super.toString() + calculateTotalSal() +"]";
	}
	@Override
	public double calculateTotalSal() {
		if(hours <= 40) {
			hourSal = wage*hours;
			return hourSal;
		}
		else if(hours>40) 
			hourSal= (40 * wage) + (hours -40 )*wage * 1.5;
			return hourSal;
		
		
	}
	

	
	

}
