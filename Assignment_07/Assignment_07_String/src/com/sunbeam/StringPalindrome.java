package com.sunbeam;

import java.util.Scanner;


public class StringPalindrome {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		String n1;
		System.out.println("enter the number : ");
		n1= sc.next();
		
		StringBuffer s2 = new StringBuffer(n1);
				
		System.out.println("reverse number is : "+s2.reverse());
		
		if(n1.equals(s2.toString())) {
			System.out.println("String is in Palindrome");
		}
		else {
			System.out.println("String is not in Palindrome");
		}
		
		
	}

}
