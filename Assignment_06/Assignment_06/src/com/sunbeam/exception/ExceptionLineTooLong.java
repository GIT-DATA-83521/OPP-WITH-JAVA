package com.sunbeam.exception;

public class ExceptionLineTooLong extends RuntimeException 
{
	private String msg;
	
	public ExceptionLineTooLong()
	{
	    msg="";
		// TODO Auto-generated constructor stub
	}

	public ExceptionLineTooLong(String msg)
	{
		
		this.msg = msg;
	}
	@Override
	public void printStackTrace() 
	{
		// TODO Auto-generated method stub
	//	super.printStackTrace();
		System.out.println("Exception :");
		System.out.println("Massage : "+msg);
	}

}