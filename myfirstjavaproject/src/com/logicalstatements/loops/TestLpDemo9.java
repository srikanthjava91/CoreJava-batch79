package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpDemo9 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !! ");
		
//		System.out.println(Math.sqrt(18));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto where you want to print : ");
		int n = sc.nextInt();// 10
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i + " -> " + count);
			}
		}

	}
}
