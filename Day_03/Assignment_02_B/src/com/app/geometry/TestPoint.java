package com.app.geometry;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		int xaxis;
		int yaxis;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details for Point 1");
		
		System.out.print("Enter X1 value : ");
		xaxis=sc.nextInt();
		
		System.out.println("Enter Y1 value : ");
		yaxis = sc.nextInt();
		
		Point2D p1=new Point2D(xaxis,yaxis);
		
		System.out.println("*********************************************************");
		
		System.out.println("Enter details for Point 2");
		
		System.out.print("Enter X2 value : ");
		xaxis=sc.nextInt();
		
		System.out.println("Enter Y2 value : ");
		yaxis = sc.nextInt();
		
		Point2D p2=new Point2D(xaxis,yaxis);
		
		System.out.println("*********************************************************");
		
		
//		p1.display();
//		
//		
//		p2.display();
//		
		
		System.out.println("first point is : "+p1.getDetails());
		System.out.println("second point is : "+p2.getDetails());
		
		System.out.println("*******************************************************");
		
		if(p1.isEqual(p2))
		{
			System.out.println("points are same");
			
		}
		else
		{
			System.out.println("points are not same");
			p1.calculateDistance(p2);
		}
	
	
	}
	
	
	
}
