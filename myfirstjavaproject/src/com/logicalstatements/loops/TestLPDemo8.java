package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Math table using for loop ..? 
//Input : 9 and how many time you want o print 10 
//output : 
//9 X 1 = 09
//9 X 2 = 18
//9 X 3 = 27
//9 X 4 = 36
//9 X 5 = 45
//9 X 6 = 54
//9 X 7 = 63
//9 X 8 = 72
//9 X 9 = 81
//9 X 10 = 90
public class TestLPDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("What table you want to proceed with : ");
		int n = sc.nextInt();

		System.out.println("How many values you want to print .? ");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}

	}
}
