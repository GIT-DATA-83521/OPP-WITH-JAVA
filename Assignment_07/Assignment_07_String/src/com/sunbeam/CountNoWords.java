package com.sunbeam;

import java.util.Scanner;

public class CountNoWords {

	public static void main(String[] args) {
		
//		int count =0;
		
//		String s1 = new String("Chandler Bing");
//		System.out.println("length of string "+s1.length());
//		String arr[] = s1.split(" ");
//		for (String stri: arr)
//			{
//			System.out.println(stri);
//			count++;
//			}
//			System.out.println("No of words are : "+count);

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		str = sc.nextLine();
	

	

	String  [] count = str.split(" ");
	int x=count.length;
		System.out.print(x);
		
	

	}

}
