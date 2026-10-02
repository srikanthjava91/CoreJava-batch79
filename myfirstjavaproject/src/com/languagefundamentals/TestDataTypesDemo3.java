package com.languagefundamentals;

//Wrapper Caching 
//== operator checks the References(addresses) if the Object types but not values.
//== operator checks the values if it is primitive data types.
public class TestDataTypesDemo3 {

	public static void main(String[] args) {

		int i3 = 10;
		int i4 = 10;
		System.out.println(i3 == i4);

//		The Range for Wrapper caching is -128 to 127 
//		If the range is within the -128 to 127 
//		all the values are sharing same Object Reference.
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);

//		If the Range is crossed then for every element, it's creating new Object
//		so the below values are not same based addresses of the object.
		Integer i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);
	}
}
