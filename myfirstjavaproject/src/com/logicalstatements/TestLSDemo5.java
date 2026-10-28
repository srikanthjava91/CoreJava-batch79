package com.logicalstatements;

import java.util.Scanner;

//Whenever we have multiple conditions to check and provide 
//unique solution for each condition then will go for else-if.
//WAP to print Grades based on the Marks Percentage ..?
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks Percentage ..? ");
		double marksP = sc.nextDouble();

		if (marksP > 100 || marksP < 0) {
			System.out.println("Invalid marks to calculate !!");
		} else if (marksP >= 90) {
			System.out.println("Grade A");
		} else if (marksP >= 80) {
			System.out.println("Grade B");
		} else if (marksP >= 70) {
			System.out.println("Grade C");
		} else if (marksP >= 60) {
			System.out.println("Grade D");
		} else if (marksP >= 35) {
			System.out.println("Just Passed");
		} else {
			System.out.println("Failed !!");
		}

	}

}
