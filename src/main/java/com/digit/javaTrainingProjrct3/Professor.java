package com.digit.javaTrainingProjrct3;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor {
	static String prof1 = "Ram";
	static String prof2 = "Karan";
	static String prof3 = "Shyam";

	static ArrayList<String> set3 = new ArrayList<>();

	static void addProf() {
		set3.add(prof1);
		set3.add(prof2);
		set3.add(prof3);

	}

	int i = 0;

	Scanner sc = new Scanner(System.in);
	Course c1 = new Course();
//
	void professorMenu() {
		System.out.println();

		System.out.println("Professor Dashboard");
		System.out.println();
		System.out.println("1. GradeStudent");
		System.out.println("2. View Professor Course");
		System.out.println("3. Main Menu");
		System.out.println("0. Exit");

		int ch;
		System.out.println("Enter your Choice: ");
		ch = sc.nextInt();
		switch (ch) {

		case 1: {
			
				gradeStudent();
			
			break;
		}
		case 2:
			profCourse();
			break;

		case 3:
			Admin.start(); break;

		case 0:
			System.exit(0);
		}

	}

	
	void profCourse() {
		System.out.println("Professor Alloted Course are: ");
		for (int k = 0; k < 3; k++)
			System.out.println(c1.set.get(k));
		System.out.println();
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		System.out.println("2. Professor Page");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		int ch=sc.nextInt();
		if(ch==1) {
			Admin.start();
		}
		else if(ch==2) {
			professorMenu();
		}
		else {
			System.exit(0);
		}
	}

	
	static char[] grades = new char[3];
    	
	 void gradeStudent() {
		for(int k=0;k<3;k++) { 
		System.out.println("Info of student " + (k + 1));
		System.out.println();
		System.out.println("Student Name: "+Student.set2.get(k));
		System.out.println("Student Id: "+Student.set2.get(k+3));
		System.out.println("Student Course: "+Course.set.get(k));
		System.out.println();
		char grade = 'A';

		grades[i] = (char) (grade + i);
		i++;
		System.out.println("Grade of student " + Student.set2.get(k) + " is " + grades[k]);
		System.out.println();
		}
	 
		System.out.println("Grade Student Operation completed");
		System.out.println();
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		System.out.println("2. Professor Page");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		int ch=sc.nextInt();
		if(ch==1) {
			Admin.start();
		}
		else if(ch==2) {
			professorMenu();
		}
		else {
			System.exit(0);
		}
	 }

	 
	 
	

}
