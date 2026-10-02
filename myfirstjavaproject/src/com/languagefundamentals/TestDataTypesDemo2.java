package com.languagefundamentals;

import java.math.BigInteger;

class Dog {
	String name = "Tommy";

}

//Object Data Types 
public class TestDataTypesDemo2 {

	// Pre-defined classes
//	In Java, Collection of characters with double quotes 
//	storing into a single variable will consider String.
	String s = "Srikanth";// String Literals
	String s1 = new String("Vcube");// String Object
	StringBuffer sb = new StringBuffer("Java");

	// Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi = 100;
	BigInteger bi1 = new BigInteger("1000");
	BigInteger bi2 = new BigInteger("10");

//	BigDecimal bd = new BigDecimal("7987646578976765457897709856589770856468578676453565879685864753548766896");

	// Pre-defined Wrapper Objects
	Integer i = 100;// converting Primitive data type to Wrapper oBject data type : Auto-Boxing
	Integer i1 = Integer.valueOf(100);

	int i2 = i;// Converting Wrapper Object Data Types to Primitive will consider as :
				// AUto-Unboxing
	int i3 = i1.intValue();

	Boolean boo = true;
	Character c = 'A';

	// User-defined object data types
	Dog d = new Dog();

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestDataTypesDemo2 t = new TestDataTypesDemo2();

		System.out.println(t.d.name);

		System.out.println(t.s);// null
		System.out.println(t.s1);// null

		// The operator + is undefined for the argument type(s)
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t.bi1 + t.bi2);
		System.out.println(t.bi1.add(t.bi2));
		System.out.println(t.bi1.multiply(t.bi2));
		System.out.println(t.bi1.mod(t.bi2));
		System.out.println(t.bi1.divide(t.bi2));

		System.out.println(t.sb);// null

		System.out.println(t.bi1);// null
		System.out.println(t.bi2);// null
//		System.out.println(t.bd);// null

		System.out.println(t.i);// null
		System.out.println(t.boo);// null
		System.out.println(t.c);// null

		System.out.println(t.d);// null

		System.out.println("main method ended !!");

	}
}
