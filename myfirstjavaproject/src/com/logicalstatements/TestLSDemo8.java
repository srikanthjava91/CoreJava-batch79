package com.logicalstatements;

import java.util.Scanner;

//WAP to print Day info Based the Day number..
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("mian mthod started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day number : ");
		int day = sc.nextInt();

		switch (day) {
		case 1 -> System.out.println("Sunday");
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> {
			System.out.println("Thursday");
			System.out.println("Thursday is cool day ");
		}
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default -> System.out.println("Entered number is invalid day");

		}
	}

}
