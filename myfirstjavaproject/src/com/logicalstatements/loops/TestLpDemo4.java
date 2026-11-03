package com.logicalstatements.loops;

import java.util.Scanner;

//what is Perfect number = Sum of it's factors excluding itself.
//WAP to find whether the given number is perfect or not ..? 
// 6 - 1 2 3 6 --> 1 + 2 + 3 = 6 
//28 - 1 2 4 7 14 --> 28 
//496 

//input : number --> 6 
//output : true or false -> boolean 

public class TestLpDemo4 {

	static boolean isperfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		boolean status = isperfect(n);

		if (status) {
			System.out.println("The Given number is Perfect ");
		} else {
			System.out.println("The Given number is not Perfect ");
		}

		System.out.println("main method ended ");

	}

}
