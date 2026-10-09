package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to print Employee info !!
public class EmployeeInfo {

	void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);//Resource leak: 'sc' is never closed

		System.out.println("enter your salary : ");
		double sal = sc.nextDouble();

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		System.out.println("Enter your name : ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter your phone : ");
		long phone = sc.nextLong();

		System.out.println("Enter your gender");
		char gen = sc.next().charAt(0);//Method chaining 

		getEmployeeSalary(sal);
		employeeAgeInfo(age);
		employeeNameInfo(name);
		employeePhoneDetails(phone);
		employeeGenderInfo(gen);

		sc.close();
		System.out.println("main method ended ");

	}

	void employeeGenderInfo(char gen) {
		System.out.println("Gender Info : " + gen);
	}

	void employeePhoneDetails(long ph) {
		System.out.println("Phone number of the EMployee  " + ph);
	}

	void employeeNameInfo(String name) {
		System.out.println("Employee Name: " + name);
	}

	void employeeAgeInfo(int age) {
		System.out.println("Employee age is : " + age);
	}

	void getEmployeeSalary(double salary) {
		System.out.println("The Current Salary is : " + salary);
	}
}
