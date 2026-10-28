package com.logicalstatements;

import java.util.Scanner;

//WAP to print Day info Based Day String
//Cannot switch on a value of type double. 
//Only convertible int values, strings or enum variables are permitted
public class TestLSDemo9 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day ");
		String day = sc.next();

		switch (day) {
		case "Monday" -> System.out.println("Monday's are Lazy day to work !!");
		case "Tuesday", "Wednesday", "Thursday" -> {
			System.out.println("Thease days are normal days to work !!");
			System.out.println("Non-veg-Day in Hostel ");
		}
		case "Friday" -> System.out.println("Weekend mode strated ");
		case "Saturday" -> System.out.println("Weekend and Funay to plan Movies ");
		case "Sunday" -> {
			System.out.println("Full non-veg day at home");
			System.out.println("REST Mode");
		}
		default -> System.out.println("Entered day is invalid !!");
		}
	}
}
