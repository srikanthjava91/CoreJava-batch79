package com.logicalstatements;

import java.util.Scanner;

//WAP to find whether the Given number is positive or negative 
public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n1 = sc.nextInt();

		if (n1 >= 0) 
			System.out.println("The Given number is Positive ");
		else 
			System.out.println("The Given number is Negative number ");
		
		
		System.out.println("main method ended ");

	}

}
