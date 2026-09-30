package com.javaintroduction;

///WAP to print Indian Cricketer Information ..? 
///JVM is providing default values, when we are not assigning any values for class level data 
///whether it is static or instance.
///For Numeric values JVM will give default value as 0.
///For any Object values JBM will give default values as null.
///
///Any Java Program, If there is no constructor then 
///Java Compiler will create a default constructor which we cannot see.
///
///Q) What is the difference between static & instance when we use what ..? 
///Whenever the data is same for all the objects then go and make sure that data as static.
///Whenever the data is changing from object to object then go and make sure that data as instance.
/// All static related data is storing it into  --> Method Area --> Whenever the class loaded.
/// All instance related data is storing it into --> Heap Area --> Whenever the Object created.
///
///For every Object,JVM create a new Copy with default data whereas for static data it's using same copy for all objects.

 class Cricketer {

//	Step 1: Declaration 
//	static variables 
	static int countryID;
	static String countryName;

//	instance variables or Non-static variables 
	int jerseyNumber;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team ");

//		Step 2: Initialization 
		countryID = 91;
		countryName = "India";

//		Step 3: Accessing or Representing the static data
		System.out.println("Country ID  : " + countryID);// 0 --> 91
		System.out.println("Country Name : " + countryName);// null --> India

//		Accessing the instance data in static area is not possible directly.
//		Cannot make a static reference to the non-static field jerseyNumber
//		System.out.println(jerseyNumber);//0
//		Cannot make a static reference to the non-static field cricketerName
//		System.out.println(cricketerName);//null

//		Can we access instance data in static area ..? 
//		No Directly, But "we can create a Object to access instance data in static area".

//		LHS : Class name + Object Reference variable 
//		RHS : new is a keyword to create object in java with constructor calling.
//		So total RHS will consider as Object and which we are storing it into 
//		LHS will consider Object reference variable of Class.
		Cricketer msd = new Cricketer();// Object Creation

		msd.jerseyNumber = 7;
		msd.cricketerName = "Mahendra Singh Dhoni";
		System.out.println("Jersey Number : " + msd.jerseyNumber);// 0 --> 7
		System.out.println("Name of the Cricketer : " + msd.cricketerName);// null --> MSD
		System.out.println("**********************************************");

		Cricketer vk = new Cricketer();
		vk.jerseyNumber = 18;
		vk.cricketerName = "Virat Kohli";
		System.out.println("Country ID  : " + countryID);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + vk.jerseyNumber);
		System.out.println("Name of the Cricketer : " + vk.cricketerName);
		System.out.println("**********************************************");

		Cricketer rs = new Cricketer();
		rs.jerseyNumber = 45;
		rs.cricketerName = "Rohit Sharma";
		System.out.println("Country ID  : " + countryID);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + rs.jerseyNumber);
		System.out.println("Name of the Cricketer : " + rs.cricketerName);
		System.out.println("**********************************************");

		Cricketer kl = new Cricketer();
		countryID = 92;
		countryName = "Bharath";
		kl.jerseyNumber = 1;
		kl.cricketerName = "K Lokes Rahul";
		System.out.println("Country ID  : " + countryID);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + kl.jerseyNumber);
		System.out.println("Name of the Cricketer : " + kl.cricketerName);
		System.out.println("**********************************************");

		Cricketer jaddu = new Cricketer();
		jaddu.jerseyNumber = 8;
		jaddu.cricketerName = "Ravindra Jadeja";
		System.out.println("Country ID  : " + countryID);// 91 92
		System.out.println("Country Name : " + countryName);// India Bharath
		System.out.println("Jersey Number : " + jaddu.jerseyNumber);
		System.out.println("Name of the Cricketer : " + jaddu.cricketerName);
		System.out.println("**********************************************");

	}

}
