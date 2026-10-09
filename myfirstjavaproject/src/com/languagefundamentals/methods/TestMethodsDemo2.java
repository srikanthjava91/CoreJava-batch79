package com.languagefundamentals.methods;

//WAP to print calculated values for addition subtraction multiplication Division & Modulus
//by using Arithmetic Operators --> + - * / % 
//No return type + With parameters 
public class TestMethodsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

//		Call by value 
//		methods calling by passing the values : arguments  
		addition(100, 800);// sum
		subtraction(674, 492);// Difference
		multiplication(6545, 7689);// product
		division(98, 5);// quotient --> 19
		modulus(98, 5);// reminder --> 3

		System.out.println("main method ended ");

	}

	// a & b will consider as Parameters
	static void addition(int a, int b) {
		System.out.println("addition method called ");
		System.out.println(a + b);
	}

	static void subtraction(int a, int b) {
		System.out.println("subtraction method called ");
		System.out.println(a - b);
	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication method called ");
		System.out.println(a * b);
	}

	static void division(int a, int b) {
		System.out.println("division method called ");
		System.out.println(a / b);
	}

	static void modulus(int a, int b) {
		System.out.println("modulus method called ");
		System.out.println(a % b);
	}
}
