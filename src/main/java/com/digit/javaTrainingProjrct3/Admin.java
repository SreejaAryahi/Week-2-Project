package com.digit.javaTrainingProjrct3;

import java.util.Scanner;

public class Admin {
	static Scanner sc = new Scanner(System.in);


	static Course c1 = new Course();
	static Professor p1 = new Professor();
	static Student s1 = new Student();

	static String adminUsername = "A";
	static String adminPswd = "1";

	 static void adminMenu() {
		 System.out.println();
		System.out.println("Admin Dashboard");
		System.out.println();
		System.out.println("1. Course Registration");
		System.out.println("2. Student Registration");
		System.out.println("3. Professor Registeraton");
		System.out.println("4. Main menu");
		System.out.println("0. Exit");
		System.out.println();
		System.out.print("Enter an option: ");
		System.out.println();
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			courseRegis();
			break;

		case 2:
			studRegis();
			break;

		case 3:
			profRegis();
			break;

		case 4:
			start();
			break;

		case 0:
			System.exit(0);
			

		}

	}

	 static int j=1;
	 
	static void studRegis() {
		
		
		int i = j;
		
		while (i <= 3) {
			System.out.println("Student " + i + " Registration: ");
			System.out.println();

			System.out.print("Student Name: ");
			String sd1 = sc.next();

			System.out.print("Student  Id: ");
			String sd1Id = sc.next();

			if (s1.set2.contains(sd1) && s1.set2.contains(sd1Id)) {
				System.out.println( "Student "+ sd1 + " is registered Successfully");
				System.out.println();
			} else {
				 j=i;
				System.out.println("Invalid Course Detail");
				System.out.println("Try Again ");
				System.out.println();
				studRegis();

			}
			i++;
			if(i==3) {
				j=1;
			}
		}
		System.out.println();
		System.out.println("Student Registration Operation Completed");
		System.out.println();
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		System.out.println("2. Admin Page");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		
		int ch=sc.nextInt();
		if(ch==1) {
			Admin.start();
		}
		else if(ch==2) {
			adminMenu();
		}
		else {
			System.exit(0);
		}
	}

	static void profRegis() {
		
		int i = j;
		while (i <= 3) {
			System.out.println("Professor " + i + " Registration: ");
			System.out.println();

			System.out.print("Professor Name: ");
			String pf1 = sc.next();

			if (p1.set3.contains(pf1) ) {
				System.out.println( "Professor "+pf1 + "  registered Successfully");
				System.out.println();
			} else {
				j=i;
				System.out.println("Invalid Course Detail");
				System.out.println("Try Again ");
				System.out.println();
				profRegis();

			}
			i++;
			if(i==3) {
				j=1;
			}
		}
		System.out.println();
		System.out.println("Professor Registration Operation Completed");
		System.out.println();
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		System.out.println("2. Admin Page");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		int ch=sc.nextInt();
		if(ch==1) {
			Admin.start();
		}
		else if(ch==2) {
			adminMenu();
		}
		else {
			System.exit(0);
		}

	}

	static void registerAdmin() {
		
		System.out.println("Admin registration : ");
		System.out.println();
		System.out.print("Enter username: ");
		String adminU = sc.next();
		System.out.print("Enter password: ");
		String adminP = sc.next();

		if (adminU.equals(adminUsername) && (adminP.equals(adminPswd))) {
			System.out.println();
			System.out.println("Admin Login Successful");
			System.out.println();
		} else {
			System.out.println("Invalid Credentials");
			System.out.println("Try Again ");
			System.out.println();
			registerAdmin();
		}
	}

	static void courseRegis() {
		
		int i = j;
		while (i <= 3) {
			System.out.println("Course " + i + " Registration: ");
			System.out.println();

			System.out.print("Course Name: ");
			String course1 = sc.next();

			System.out.print("Course Id: ");
			String courseId = sc.next();
			
			if (c1.set.contains(course1) && c1.set.contains(courseId)) {
				System.out.println( course1 +" Course "+ " registered Successfully");
				System.out.println();
			} else {
				j=i;
				System.out.println("Invalid Course Detail");
				System.out.println("Try Again ");
				System.out.println();
				courseRegis();

			}
			i++;
			if(i==3) {
				j=1;
			}
		}
		
		System.out.println("Course Registration Operation Completed");
		System.out.println();
		System.out.println("Please Choose an Option.");
		System.out.println("1. Main Page");
		System.out.println("2. Admin Page");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		int ch=sc.nextInt();
		if(ch==1) {
			Admin.start();
		}
		else if(ch==2) {
			adminMenu();
		}
		else {
			System.exit(0);
		}
		

	}

	static void start() {
		System.out.println("Welcome to Main Menu ");
		System.out.println();
		System.out.println("1. Admin ");
		System.out.println("2. Professor ");
		System.out.println("3. Student ");
		System.out.println("4. Courses");
		System.out.println("0. Exit");
		System.out.println();

		System.out.print("Enter your choice: ");
		int ch;
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			adminMenu();
			break;

		case 2:
			p1.professorMenu();
			break;

		case 3:
			s1.studentMenu();
			break;

		case 4:
			Course.courseDisplay();
			break;

		case 0:
			System.out.println("$$$---Thank YOu Visiting Our Websites---$$$");
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("$$$$$-------Welcome to the Course Management Website-------$$$$$");
		System.out.println();

		
		
		Admin.registerAdmin();
		Student.addStudent();
		
		Course.addCourse();
		
		Professor.addProf();
		
		Admin.start();
		
		

	}

}
