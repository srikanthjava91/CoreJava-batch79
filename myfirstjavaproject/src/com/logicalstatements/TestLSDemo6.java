package com.logicalstatements;

import java.util.Scanner;

//WA POC to Check the Eligibility for marriage now a days through our Matrimonial site..
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello !! Can you enter your Full name");
		String fullname = sc.nextLine();
		System.out.println("Nice to meet you Mr." + fullname);

		System.out.println("Can you please enter your assets : ");
		double assets = sc.nextDouble();

		if (assets >= 50000000.00) {
			System.out.println("Oh !! Nice to start !!");
			
			System.out.println("Can you please enter your Salary : ");
			double salary = sc.nextDouble();
			
			if(salary >= 2500000.00) {
				System.out.println("Good to know !! Let's start the conversation !!");
				
				System.out.println("Enter your age : ");
				int age = sc.nextInt();
				
				if(age >=25 && age <=29 ) {
					System.out.println("Your age is matching, we have few more questions to proceed !");
				
					System.out.println("Enter you height & weight ");
					float height = sc.nextFloat();
					double weight = sc.nextDouble();
					
					if((height >=5.6 && height <=6.1) && (weight >=65 && weight <=75)) {
						System.out.println("Good to know !! we are almost good");
						
						System.out.println("Do you have Siblings ..? ");
						boolean sibStatus = sc.nextBoolean();
						
						if(!sibStatus) {
							System.out.println("Thank god !! Will come back later !!");
						}else {
							System.out.println("Oh mY god !! ");
						}
						
					}else {
						System.out.println("Sorry !!");
					}
					
				
				}else {
					System.out.println("Your is not matching !!");
				}
				
			}else {
				System.out.println("Your prfile is not matching with my daughter's profile !!");
			}
			
		}else {
			System.out.println("Sorry !! Will discuss later ");
		}

	}

}
