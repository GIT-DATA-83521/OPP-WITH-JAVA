package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Employee e1 = new SalariedEmployee();
//		e1.accept(sc);
//		e1.dispaly();
//		e1.calculateTotalSal();

//		Employee e2 = new HourlySalary();
//		e2.accept(sc);
//		e2.dispaly();
//		e2.calculateTotalSal();

//		Employee e3 = new CommEmployee();
//		e3.accept(sc);
//		e3.dispaly();
//		e3.calculateTotalSal();

//		Employee e4 = new BaseCommEmployee();
//		e4.accept(sc);
//		e4.dispaly();
//		e4.calculateTotalSal();

		int choice;

		Employee e5;

		System.out.println("0 - Exit");
		System.out.println("1 - Weekly Employee Salary");
		System.out.println("2 - Hourly Employee Salary");
		System.out.println("3 - Commission Employee Salary");
		System.out.println("4 - Base Commission Employee Salary");
		System.out.println("Enter your Choice ");
		choice = sc.nextInt();

		switch (choice) {
		case 0:
			System.out.println("*******************Thank you ******************");
			break;

		case 1:
			e5 = new SalariedEmployee();
			e5.accept(sc);
			//e5.dispaly();
			e5.calculateTotalSal();

			break;

		case 2:
			e5 = new HourlySalary();
			e5.accept(sc);
		//	e5.dispaly();
			e5.calculateTotalSal();
			System.out.println(e5.toString());

			break;

		case 3:
			e5 = new CommEmployee();
			e5.accept(sc);
		//	e5.dispaly();
			e5.calculateTotalSal();
			System.out.println(e5.toString());
			
			break;
		case 4:
			e5 = new BaseCommEmployee();
			BaseCommEmployee b1 = (BaseCommEmployee)e5;
			e5.accept(sc);
		//	e5.dispaly();
			e5.calculateTotalSal();
			b1.salaryAfterIncrement();			
			System.out.println(e5.toString());

			break;

		default:
			System.out.println("Enter correct Choice ");
			break;
		}

	}

}
