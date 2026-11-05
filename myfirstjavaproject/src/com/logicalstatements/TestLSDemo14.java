package com.logicalstatements;

import java.util.Scanner;

// WAP to find the digits count of the given number..? 
public class TestLSDemo14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int digitCount = 0;

		while (n > 0) {
			n = n / 10;//123/10 -12, 12/10--> 1, 1/10 --> 0
			digitCount++;
		}

		System.out.println("COunt of the Given Digits are : " + digitCount);

	}

}
