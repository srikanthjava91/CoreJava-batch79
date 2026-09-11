package com.javaintroduction;

public class Customer {
	
	@Override
	protected void finalize() {
		System.out.println("finalize method called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Customer c1 = new Customer();
//		com.javaintroduction.Customer@1dbd16a6
		System.out.println(c1);// Address of the Object :

//		com.javaintroduction.Customer@7ad041f3
		Customer c2 = new Customer();
		System.out.println(c2);//Address Of the Object 
		
		c1 =null;
		
//		Runs the garbage collector.
		System.gc();
		

		System.out.println("main method ended ");
	}

}
