package com.languagefundamentals.methods;

//No return type + No Parameters 
public class TestMethodsDemo1 {

	// static method
	public static void welcome() {
		System.out.println(Thread.currentThread());
		System.out.println("Welcome to Java World ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());
		
		TestMethodsDemo1 t1 = new TestMethodsDemo1();

//		Calling the method
//		static methods can call directly or by using class name
		welcome();
		TestMethodsDemo1.welcome();

		t1.hello();

		System.out.println("main method ended ");
	}

	// instance method
	public void hello() {
		System.out.println(Thread.currentThread());
		System.out.println("Hello Good morning ");
	}
}
