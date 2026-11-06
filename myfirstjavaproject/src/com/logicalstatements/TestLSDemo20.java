package com.logicalstatements;

public class TestLSDemo20 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

//		a = a + b;// 30
//		b = a - b;// 10
//		a = a - b;//20
		
//		16 8 4 2 1
		//01010
		//10100
//		-----------
		a = a ^ b;//  30
		b = a ^ b;// 
		a = a ^ b;//
		

		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);
		
	}

}
