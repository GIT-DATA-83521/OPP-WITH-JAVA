package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;

public class Mainn
{

	public static void main(String[] args) 
	{
		String string;
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("enter string");
			string=sc.nextLine();
	
			if(string.length()>80)
				throw new ExceptionLineTooLong("string is too long");
			System.out.println("String has been entered successfully");
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
	}

}