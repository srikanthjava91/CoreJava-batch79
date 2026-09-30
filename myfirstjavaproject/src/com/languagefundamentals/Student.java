package com.languagefundamentals;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

//4 5 6 7 8 9  
public class Student {

	int roll_number;
	String name;
	int age;

	public strictfp void _hello() {
		System.out.println("Good morning !! Have a nice day !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Student s$ = new Student();
		System.out.println(s$.roll_number);
		System.out.println(s$.name);
		System.out.println(s$.age);
		s$._hello();

		System.out.println("main method ended !!");

	}

}
