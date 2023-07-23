package com.digit.javaTrainingProjrct3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	Course c1 = new Course();

	Scanner sc1 = new Scanner(System.in);
	static String stud1 = "Suraj";
	static String stud2 = "Sreeja";
	static String stud3 = "Himanshu";

	static String stud1Id = "Suraj123";
	static String stud2Id = "Sreeja123";
	static String stud3Id = "Himanshu123";

	static ArrayList<String> set2 = new ArrayList<>();

	static void addStudent() {
		set2.add(stud1);
		
		set2.add(stud2);
		
		set2.add(stud3);
		set2.add(stud1Id);
		set2.add(stud2Id);
		set2.add(stud3Id);

	}

	  void scoreCheck() {
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Grade of student " + set2.get(i + i) + " in "+" Course "+Course.set.get(i)+" is : " + Professor.grades[i]);
			System.out.println();

		}
		
		
		System.out.println();
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		System.out.println("2. Student Page");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		int ch=sc1.nextInt();
		if(ch==1) {
			Admin.start();
		}
		else if(ch==2) {
			studentMenu();
		}
		else {
			System.exit(0);
		}
	}

	void markSheetCheck() {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println("Marksheet of student " + set2.get(i + i));
			System.out.println("Name : " + set2.get(i + i));
			System.out.println("Student Id : " + set2.get(i + 1));
			System.out.println("Course : " + Course.set.get(i));
			System.out.println("Course Id :	" + Course.set.get(i + 3));
			System.out.println("Grade : " + Professor.grades[i]);
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		System.out.println("2. Student Page");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		int ch=sc1.nextInt();
		if(ch==1) {
			Admin.start();
		}
		else if(ch==2) {
			studentMenu();
		}
		else {
			System.exit(0);
		}
	}

	void studentMenu() {
		System.out.println("Student Dashboard");
		System.out.println("1. Score ");
		System.out.println("2. MarkSheet");
		System.out.println("3. Main Menu");
		System.out.println("0. Exit");

		System.out.println("Enter your choice: ");
		int ch = sc1.nextInt();

		switch (ch) {

		case 1:
			scoreCheck();
			break;

		case 2:
			markSheetCheck();
			break;
		case 3:
			Admin.start(); break;
		case 0:
			System.exit(0);
		}
	}

}
