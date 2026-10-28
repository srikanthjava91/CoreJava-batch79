package com.languagefundamentals;

public class TestMainDemo1 {
	
	static String name = "Srikanth";

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		System.out.println(TestMainDemo1.name.length());

		for (String a : args) {
			System.out.println(a);
		}

	}

}
