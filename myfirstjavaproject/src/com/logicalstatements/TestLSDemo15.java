package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Given number is Armstrong or not ..? 
//An Armstrong number is a number that equals the 
//sum of its own digits each raised to the power of the number of digits—for example, 153 = 1³ + 5³ + 3³.
public class TestLSDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbe r: ");
		int n = sc.nextInt();
		int r = 0;
		int sumP = 0;
		int digitCount = 0;
		int n1 = n;
		int temp = n;

//		while(n>0) {
//			n = n/10;
//			digitCount++;
//		}

		String str = Integer.toString(n);
		digitCount = str.length();

		while (n1 > 0) {
			r = n1 % 10;
			n1 = n1 / 10;
//			sumP = sumP + r * r * r;
			sumP = (int) (sumP + Math.pow(r, digitCount));

		}

		if (sumP == temp) {
			System.out.println("The Given number is Armstrong number");
		} else {
			System.out.println("The Given numbe ris not an Armstrong number ");
		}
	}

}
