package com.javaintroduction;

//static block vs instance block 
public class TestDemo6 {

	// instance variable
	// static variable
	static TestDemo6 t = new TestDemo6();// Object Creation
	static TestDemo6 t1 = new TestDemo6();// Object Creation

	static {
		System.out.println("static block loaded");
	}

	{
		System.out.println("instance block loaded");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("main method ended ");
	}

}
