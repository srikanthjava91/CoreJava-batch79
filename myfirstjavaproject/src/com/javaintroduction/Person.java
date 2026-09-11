package com.javaintroduction;

public class Person {

//	Called by the garbage collector on an object
//	when garbage collection determines that there are no more references to the object.
//	A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.
	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	void hello() {
		System.out.println("Hello ");
//		Out of scope : Object inside the method 
		Person p = new Person();
		System.out.println("hello  method ended !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Person p1 = new Person();
		System.out.println(p1);// 1dbd16a6

		Person p2 = new Person();
		System.out.println(p2);// 7ad041f3

		Person p3 = new Person();
		System.out.println(p3);// 7ad041f3

//		Nullifying the Object
		p1 = null;

//		Re-assign the object 
		p2 = p3;

//		Anonymous object 
		new Person().hello();

		///		Runs the garbage collector in the Java Virtual Machine.
		System.gc();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

//		 Returns a hash code value for this object.
//		This method is supported for the benefit of hash tables such as those provided by java.util.HashMap.
//		System.out.println(p1.hashCode());// 498931366

//		int a = 0x1dbd16a6;
//		System.out.println(a);
	}
}
