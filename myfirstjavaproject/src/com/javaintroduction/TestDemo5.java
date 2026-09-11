package com.javaintroduction;

public class TestDemo5 {
	
	static TestDemo5 t = new TestDemo5();

	// In static methods, can we call static methods directly ..? Yes
	static void method1() {
		method2();
		System.out.println("method1 called !!");
	}

//	In instance method, can we call instance methods directly ..? YES 
	void method3() {
		method4();
		System.out.println("method3 called !!");
	}

	// In instance, can we call static methods directly ..?YES
	void method4() {
		System.out.println("method4 called !! ");
		method5();
	}

	static void method5() {
		System.out.println("method5 called !! ");
	}

//	In static method, can we call instance methods directly ..? NO
//	If we want to create we must need to create object..
	static void method2() {
		t.method3();
		System.out.println("method2 called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo5.method1();
		System.out.println("main method ended ");
	}
}
