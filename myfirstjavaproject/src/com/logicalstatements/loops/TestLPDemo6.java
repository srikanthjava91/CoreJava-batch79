package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to print factorial of a given number using recursion ..?
public class TestLPDemo6 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int f = fact(n);
		System.out.println("Factorial ofa given number is:  " + f);

	}

	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * fact(n - 1);
	}
}
