package com.languagefundamentals.constructor;

public class Student {

	int roll_number;
	String name;

//	 no-arg constructors
	Student() {
		System.out.println("no-arg constructor called ");
		roll_number = 1000;
		name = "unknown";
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		The below Object is created with the help of default constructor.(if no constructors in a class)
//		The below Object is created with the help of no-arg constructor.
		Student s1 = new Student();
		s1.studentInfo();

		Student s2 = new Student();
		s2.studentInfo();

		Student s3 = new Student();
		s3.studentInfo();

		System.out.println("main method ended ");

	}

	void studentInfo() {
		System.out.println("Roll Number : " + roll_number);
		System.out.println("Name : " + name);
	}
}
