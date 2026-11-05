package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print sum of the digits of a Given number ..? 
//input : 123 = 6 
//input : 5678 = 26 
//input 1 = 1 

public class TestLpDemo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		
		System.out.println("Sum of the Digits is : " + sum);

	}

}
