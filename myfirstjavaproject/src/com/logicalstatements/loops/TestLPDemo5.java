package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print factorial of a given number using for loop ..? 
////input is : 5 --> 5!
///output is : 5 * 4 * 3 * 2 * 1 = 120
public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int fact = fact(n);
		System.out.println("Factorial of a Given number is : " + fact);
	}

	static int fact(int n) {
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 5X4=20X3=60X2 = 120X1 = 120
		}

		return fact;
	}

}
