package com.javaintroduction;

public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		hello();
		hello();
		hello();
		hello();
		
//		method1();
	}

	static void hello() {
		System.out.println("hello Good morning !");
	}
	
//	Native methods do not specify a body
//	UnsatisfiedLinkError
	static native void method1();

}
