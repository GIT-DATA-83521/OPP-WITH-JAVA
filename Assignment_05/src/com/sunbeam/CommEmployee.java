package com.sunbeam;

import java.util.Scanner;

public class CommEmployee extends Employee {
	
	private int sales;
	private double commRate;
	
	public CommEmployee() {

	}

	public CommEmployee(int sales, double commRate) {
		
		this.sales = sales;
		this.commRate = commRate;
	}
	
	
	
	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public double getCommRate() {
		return commRate;
	}

	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}

	@Override
	public void accept(Scanner sc) {

		super.accept(sc);
		System.out.println("Enter Sales : ");
		sales = sc.nextInt();
		System.out.println("Enter Comm Rate : ");
		commRate = sc.nextDouble();
		
	}
	
	@Override
	public void dispaly() {
		
		super.dispaly();
		System.out.println("Sales are : "+sales);
		System.out.println("Commision Rate is : "+commRate);
		
	}
	
	
	
	@Override
	public String toString() {
		return "CommEmployee [sales=" + sales + ", commRate=" + commRate + ", toString()=" + super.toString()
				+ calculateTotalSal()+ "]";
	}

	@Override
	public double calculateTotalSal() {
		
	return sales * commRate;
		
	}
}
