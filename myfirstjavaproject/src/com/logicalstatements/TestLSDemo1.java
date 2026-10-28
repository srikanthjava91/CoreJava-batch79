package com.logicalstatements;

import java.util.Scanner;

//WAP to check the ELigibility for Voting & Driving ..? 
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age : ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Congrtulations !! You are eligible for Voting & Driving ");
			System.out.println("Have a Good day ");
		} else {
			System.out.println("Sorry !!");

		}

		System.out.println("main method ended !!");

	}

}
