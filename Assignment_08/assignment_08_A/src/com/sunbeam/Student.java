package com.sunbeam;

public class Student   {
	int rollno;
	String name;
	double marks;
	
	public Student() {
		
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int rollno, String name, int marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
