package com.logicalstatements.loops;

//A factor is a whole number that divides another number completely, 
//meaning the remainder is zero.
//Q) WAP to print factors of a given number ..? 
//input : number --> 6 
//output : numbers --> 1 2 3 6 

//input : number --> 24 
//output : numbers --> 1 2 3 4 6 8 12 24 
import java.util.Scanner;

public class TestLpDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		findFactors(n);

	}

	static void findFactors(int n) {

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.print(n);
	}
}
