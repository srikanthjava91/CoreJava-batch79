package com.languagefundamentals;

//byte --> short --> int --> long --> float --> double 
public class TestDataTypesDemo1 {
//	byte = 1 byte = 8 bits = -128 to 127 
//	By default RHS numeric values are int so int cannot convert into byte directly.
//	-128 -127 -126 -125 ..... 0 1 2 3 4 .... 125 126 127 
	byte b = 127;
	byte b1 = (byte) 128;// CE : Type mismatch: cannot convert from int to byte
	byte b2 = (byte) 130;// Converting int to byte : Explicit Type Casting
	byte b3 = (byte) 256;//

//	short = 2 bytes = 16 bits = -32768 to 32767
	short s = 32767;
	// Type mismatch: cannot convert from int to short
	short s1 = (short) 32768;// int to Short

//	int = 4 bytes = 32 bit = -2147483648 to 2147483647
	int i = 2147483647;
	// The literal 2147483648 of type int is out of range
//	int i1 = 2147483648;
	int i2 = (int) 2147483648L;

	long l = 2147483647;// int can convert irectly into long --> Implicit Type casting
	long l1 = i2;// Implicit Type casting
	// The literal 9223372036854775808L of type long is out of range
	long l2 = 9223372036854775807L;

	float f = 5.5f;
	float f1 = 100;// int --> float //Implicit Type casting
	float f2 = 55F;
	float f3 = 768.98654322466445654F;// 5 to 6 Decimal point data then go for float

//	By default decimal point data is double.
	double d = 768.98654322466445654D;// 10 to 15 Decimal point data then go for double
	double d1 = 76754654675645646464565646D;

//	char = 2 bytes = 16 bits = -32768 to 32767= 0 to 65535 
	char c = 'M';
	// 65 = A, 66 =B, 67=C, 68=D, 69=E, 70=F, 71=G, 72=H .... 90=Z
	// 97 = a, 98 = b ....................................... 122 =z
	char c1 = 72;// ASCII code value : 0 to 127 values
	char c2 = 126;
	char c3 = 45677;
	
	char c4 = '\u0040';//unicode values or hexa values 
	
	int i3 = 'A';//char can store it into int : Implicit type casting  

	boolean boo = false;
	
//	boolean boo1 = TRUE;
//	boolean boo2 = FALSE;
//	
//	boolean boo3 = True;
//	boolean boo4 = False;
//	
//	boolean boo5 = 0;
//	boolean boo6 = 1;
//	
//	boolean boo7 = "true";
//	boolean boo8 = "false";

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDataTypesDemo1 t = new TestDataTypesDemo1();

		System.out.println("byte value : " + t.b);// 0
		System.out.println("byte value : " + t.b1);// -128
		System.out.println("byte value : " + t.b2);// -126
		System.out.println("byte value : " + t.b3);// -126

		System.out.println("short value : " + t.s);// 0
		System.out.println("short value : " + t.s1);// 0

		System.out.println("int value : " + t.i);// 0
		System.out.println("int value : " + t.i2);// 0
		System.out.println("int value : " + t.i3);// 0

		System.out.println("long value  : " + t.l);// 0
		System.out.println("long value  : " + t.l1);// 0
		System.out.println("long value  : " + t.l2);// 0

		System.out.println("float value : " + t.f);// 0.0
		System.out.println("float value : " + t.f1);// 0.0
		System.out.println("float value : " + t.f2);// 0.0
		System.out.println("float value : " + t.f3);// 0.0

		System.out.println("double value : " + t.d);// 0.0
		System.out.println("double value : " + t.d1);// 0.0

		System.out.println("char value : " + t.c);//
		System.out.println("char value : " + t.c1);//
		System.out.println("char value : " + t.c2);//
		System.out.println("char value : " + t.c3);//
		System.out.println("char value : " + t.c4);//
		
		System.out.println("boolean value : " + t.boo);// false
		
		if(t.boo) {
			System.out.println("Good morning ");
		}

		System.out.println("main method ended ");
	}

}
