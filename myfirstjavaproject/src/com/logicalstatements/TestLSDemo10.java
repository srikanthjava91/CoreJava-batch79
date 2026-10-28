package com.logicalstatements;

import java.util.Scanner;

//Simple Calculator
//WAP to print calculated value from two values based on the symbols..?
public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter a Number : ");
			int a = sc.nextInt();

			System.out.println("ENter b Number : ");
			int b = sc.nextInt();

			System.out.println("Enter a symbol like + - * / %");
			char symb = sc.next().charAt(0);
			int result = 0;

			switch (symb) {

			case '+' -> result = a + b;
			case '-' -> result = a - b;
			case '*' -> result = a * b;
			case '/' -> result = a / b;
			case '%' -> result = a % b;
			default -> {
				result = 0;
				System.out.println("Entred Symbol is invliad");
			}
			}

			System.out.println("The Resulted value is : " + result);
			System.out.println("DO you want to continue ..? Click Y for Yes N for No");
			yn = sc.next();
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("Calculation closed");
	}
}
