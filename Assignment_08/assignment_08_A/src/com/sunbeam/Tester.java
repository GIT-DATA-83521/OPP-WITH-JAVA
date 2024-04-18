package com.sunbeam;

import java.util.Comparator;

public class Tester {

	public static void selectionSort(Student[] arr, Comparator<? super Student> c) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Student arr[] = new Student[5];
		arr[0]= new Student (4,"Rachel",50); 
		arr[1]= new Student (3,"Ross",40); 
		arr[2]= new Student (1,"Chandler",80); 
		arr[3]= new Student (2,"Joey",70); 
		arr[4]= new Student (5,"Monica",90);
		
		System.out.println("before sort : ");
		
		for(Student ele:arr)
		{
			System.out.println(ele);
		}
		
		
		class StudentComparator implements Comparator<Student>
		{

			
// sorting by name

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
				
			}
			
			
// sorting by rollno
//			@Override
//			public int compare(Student o1, Student o2) {
//				int value = (int)(o1.rollno-o2.rollno);
//				return  - value;
//			}
			
			
// sorting by marks
//			@Override
//			public int compare(Student o1, Student o2) {
//				int value = (int) ((int)o1.marks - o2.marks);
//				return value;
//			}
			
		}
		StudentComparator s = new StudentComparator();
		selectionSort(arr, s);
		
		System.out.println("before sort : ");
		
		for(Student ele:arr)
		{
			System.out.println(ele);
		}
		
		
	}

}
