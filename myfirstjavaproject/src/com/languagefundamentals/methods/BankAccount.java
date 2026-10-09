package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to print Account related information in a Bank like Withdraw, Deposit & CheckBalance
public class BankAccount {

	double balance = 100000.00;

	void main(String[] args) {
		System.out.println("main method strated ");
		System.out.println("Welcome to Vcube Bank");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Amount to deposit : ");
		double dAmt = sc.nextDouble();
		deposit(dAmt);

		System.out.println("ENter the amount to Withdraw : ");
		double wAmt = sc.nextDouble();
		Withdraw(wAmt);

		System.out.println("main method ended");
	}

	void deposit(double amount) {
		System.out.println("You entered the amount is : " + amount);

		balance = balance + amount;
		checkBalance();
	}

	void Withdraw(double amount) {
		System.out.println("You Entered Amount is : " + amount);

		if (amount <= balance) {
			balance = balance - amount;
		}else {
			System.out.println("Babu !! me account lo money levu sariga check chesuko");
		}

		checkBalance();
	}

	void checkBalance() {

		System.out.println("The Current Balance is : " + balance);

	}

}
