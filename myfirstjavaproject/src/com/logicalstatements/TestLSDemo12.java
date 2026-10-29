package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks ");
		int marks = sc.nextInt();

		String grade = switch (marks / 10) {

		case 10, 9 -> {
			System.out.println("Marks kosame Puttina janalu :");
			yield "A";
		}
		case 8 -> "B";
		case 7 -> "C";
		case 6, 5, 4 -> "D";
		case 1, 2, 3 -> "Fail";
		default -> "Inavlid";

		};

		System.out.println("Grade is : " + grade);

	}

}
