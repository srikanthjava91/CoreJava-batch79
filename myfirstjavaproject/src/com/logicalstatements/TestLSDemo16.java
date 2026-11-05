package com.logicalstatements;

import java.util.Scanner;

//WAP to Convert Decimal Number to Binary number ..? 
//10 -->   2^3+ 2^2+2^1+2^0 = 8 + 4 + 2 + 1 = 1010 
public class TestLSDemo16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int r = 0;
		String bin = "";

		// 18>0
		while (n > 0) {
			r = n % 2;// 18%2=0,9%2=1,4%2=0,2%2=0,1%2=1
			n = n / 2;// 18/2=9,9/2=4,4/2=2,2/2=1,1/2=0
			bin = r + bin;// 01001 --> 10010
		}

		System.out.println("Binary number of a Given Decimal number is : " + bin);
	}
}
