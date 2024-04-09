package com.sunbeam;

import java.util.Scanner;

public class BaseCommEmployee extends CommEmployee {

	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Base Salary : ");
		baseSalary = sc.nextDouble();
	}

	@Override
	public void dispaly() {

		super.dispaly();
		System.out.println("Base salary : " + baseSalary);
	}
	
	

	@Override
	public String toString() {
		return "BaseCommEmployee [baseSalary=" + baseSalary + ", getSales()=" + getSales() + ", getCommRate()="
				+ getCommRate() + ", toString()=" + super.toString() + salaryAfterIncrement()+"]";
	}

	@Override
	public double calculateTotalSal() {
		return super.calculateTotalSal() + baseSalary;
	}

	public double salaryAfterIncrement() {
		double total = baseSalary * 0.10 + calculateTotalSal();
				return total;
	}
}
