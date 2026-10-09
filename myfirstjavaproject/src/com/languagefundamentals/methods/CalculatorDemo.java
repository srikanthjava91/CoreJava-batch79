package com.languagefundamentals.methods;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class CalculatorDemo {

	void main(String[] args) {
		System.out.println("main method started.");
		int s = addition();
		System.out.println("Addition of two number s: " + s);

		double mul = multiplication();
		System.out.println("Multiplication iof two numbers : " + mul);

		System.out.println("main method ended.");
	}

	double multiplication() {
		int a = 300;
		int b = 5;
		int product = a * b;
		return product;
	}

	int addition() {
		System.out.println("addition method called ");

		int a = 100;
		int b = 200;
		int sum = a + b;
		return sum;

	}

}
