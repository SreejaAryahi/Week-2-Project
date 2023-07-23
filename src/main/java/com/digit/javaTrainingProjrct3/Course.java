package com.digit.javaTrainingProjrct3;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {

		
		static	String cs1 = "Java";
		static String cs1Id = "J123";
		static String cs2 = "Python";
		static String cs2Id = "P123";
		static String cs3 = "CPP";
		static String cs3Id = "C123";
	
	static ArrayList<String> set = new ArrayList<>();
	static Scanner sc= new Scanner(System.in);

	 static void addCourse() {

		set.add(cs1);
		
		set.add(cs2);
		set.add(cs3);
		
		set.add(cs1Id);
		set.add(cs2Id);
		set.add(cs3Id);
	}
	

	static void courseDisplay() {
		System.out.println();
		System.out.println("Courses Items are: ");
		System.out.println();
		System.out.println("Course 1 : ");
		System.out.println("Course Name : "+cs1);
		System.out.println("Course Id : "+cs1Id);
		System.out.println();
		System.out.println("Course 2 : ");
		System.out.println("Course Name : "+cs2);
		System.out.println("Course Id : "+cs2Id);
		System.out.println();
		System.out.println("Course 3 : " );
		System.out.println("Course Name : "+cs3);
		System.out.println("Course Id : "+cs3Id);
		System.out.println();
		
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		int ch=sc.nextInt();
		if(ch==1) {
			Admin.start();
		}
		
		else {
			System.exit(0);
		}

	}

}
