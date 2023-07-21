package com.digit.javaTrainingProjrct3;

public class Professor {

	String name;
	int id;
	String course;
	
	 Professor(String name, int id, String course) {
		this.name=name;
		this.id=id;
		this.course=course;
	}
	 
	 
	
public static void main(String[] args) {
	Professor p1=new Professor("Jarasarri", 19023, "Java");
	Professor p2=new Professor("Arun Krishanan", 19045, "Python");
	Professor p3=new Professor("Bhemesh", 19085, "CPP");
	
	

	
}
}
