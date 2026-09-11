package com.javaintroduction;

public class TestDemo3 {

	static String collegeName = "Vcube";

	public static void main(String[] args) {

//		 local variable : inside a method
//		Illegal modifier for parameter collegeName; 
//		only final is permitted
		String collegeName = "VSS";

		System.out.println(collegeName);
		System.out.println(TestDemo3.collegeName);
		System.out.println(Employee.org_Name);

		// Illegal modifier for parameter a; only final is permitted
//		static int a = 10;

//		The local variable x may not have been initialized
//		JVM will not provide the default values for local variables.
		int x;
//		x=10;
//		System.out.println(x);// CE :

	}
}
