package com.languagefundamentals.methods;

//WAP to print Student info --> 2) No return type + With parameters 	
public class StudentInfo {

	void main(String[] args) {
		System.out.println("main method started ");

		getStudentAge(22);// 22 is argument
		getstudentName("Srikanth", "C");
		getStudentHeight(5.9);
		getstudentWeight(75);

		System.out.println("main method ended ");
	}

	void getstudentWeight(double weight) {
		System.out.println("Student weight is : " + weight);
	}

	void getStudentHeight(double height) {
		System.out.println("Student Height is : " + height);
	}

	void getStudentAge(int age) {// age is a parameter
		System.out.println("Student age is : " + age);
	}

	void getstudentName(String fname, String lname) {
		System.out.println("Full name of the Student is : " + fname + " " + lname);
	}

}
