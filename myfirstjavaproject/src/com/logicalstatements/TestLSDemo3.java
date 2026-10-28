package com.logicalstatements;

import java.util.Scanner;


//WAP to Check the Given name less than 15 characters to allow for a Passport Valid name.
public class TestLSDemo3 {

	public static void main(String[] args) {
		
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter Full Name : ");
		String fname = sc.nextLine();
		
		if(fname.length()<=15) {
			System.out.println("Your name is valid to add into Passport ");
		}else {
			System.out.println("Your name is too long make it short to add into passport!");
		}

	}

}
