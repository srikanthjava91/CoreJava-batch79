package com.languagefundamentals;

//== Operator checks the values of a Primitive data types.
//== Operator checks the addresses of the Object Data type.
//.equals() method checks the content of the String .
public class TestLiteralsDemo3 {

	public static void main(String[] args) {

		char c5 = 'A';
		char c6 = 'A';
		System.out.println(c5 == c6);

//		String Literals 
//		Collection of characters keep it inside the double quotes 
//		and storing into single variable will consider as String.
//		String Literals are storing inside the String Constant Pool.
		String s1 = "Srikanth";
		String s2 = "Srikanth";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));

		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4);// false

//		STring objects are Storing inside the Heap area

//		null Literals to use for Objects only.
//		We can use for any kind of objects to keep empty declaration.
		TestLiteralsDemo3 t1 = null;
//		String s2 = null;

//		boolean Literals 
		boolean boo = true;// false or true are the literals but not keywords
		if (boo) {
			System.out.println("Good morning !!");
		}

//		char Literals 
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0040';
		char c4 = '\uafba';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		t1 = new TestLiteralsDemo3();

	}
}
