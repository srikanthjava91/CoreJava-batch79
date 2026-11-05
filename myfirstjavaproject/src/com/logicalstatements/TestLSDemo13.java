package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to print the Given number in a Reverse order..? 
//input : 123 
//output : 321 

//input : 12345 
//output : 54321 
public class TestLSDemo13 {

	static int reverseNumber(int n) {
		int r = 0;
		int reverse = 0;

		while (n > 0) {
			r = n % 10;// 456%10 --> 6, 45%10= 5, 4%10 = 4
			n = n / 10;// 456/10 -> 45, 45/10 = 4, 4/10 = 0
			reverse = reverse * 10 + r;// 6, 65 , 654
		}

		return reverse;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 456

		int rev = reverseNumber(n);

		if (n == rev) {
			System.out.println("The Given number is palindrome !!");
		} else {
			System.out.println("The Given number is not a palindrome !!");
		}

		System.out.println("The Reverse number of a Given number is : " + rev);

	}
}
