package com.digit.javaTrainingProjrct3;

import java.util.List;

public class Main {
	public static void main(String[] args) {
        Admin admin = new Admin();

        // Create and register professors
        Professor professor1 = new Professor("P001", "John Doe");
        Professor professor2 = new Professor("P002", "Jane Smith");
        admin.registerProfessor(professor1);
        admin.registerProfessor(professor2);

        // Create and register courses
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Data Structures");
        admin.registerCourse(course1);
        admin.registerCourse(course2);

        // Create and register students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        admin.registerStudent(student1);
        admin.registerStudent(student2);

        // Assign professors to courses
        admin.assignProfessorToCourse(professor1, course1);
        admin.assignProfessorToCourse(professor2, course2);

        // Register students to courses
        admin.registerStudentToCourse(student1, course1);
        admin.registerStudentToCourse(student2, course2);

        // Professor grades students
        professor1.gradeStudent(student1, 90);
        professor2.gradeStudent(student2, 85);

        // Get individual score of a student for a course
        int aliceJavaScore = student1.getScoreForCourse(0);
        int bobDataStructuresScore = student2.getScoreForCourse(0);

        System.out.println("Alice's Java score: " + aliceJavaScore);
        System.out.println("Bob's Data Structures score: " + bobDataStructuresScore);

        // Get the entire marks sheet of a student
        List<Integer> aliceMarksSheet = student1.getMarksSheet();
        System.out.println("Alice's Marks Sheet: " + aliceMarksSheet);
    }

}
