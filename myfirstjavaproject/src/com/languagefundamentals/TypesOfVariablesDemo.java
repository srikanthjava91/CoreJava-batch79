package com.languagefundamentals;

//In Java, variables are Divided into total 3 types with 2 Divisions.
//Division 1: Based on the value 
//		- Primitive or Object 
//Division 2: Based on the Position 
//		- static or instance or local 

//Whenever the data is same for all the Objects then go make sure the data should be static.
//(Method Area )


//Whenever the data is different from object to object then keep those data as instance.
//(Heap Area )


//For maintaining temporary values we use local variables inside any methods.
// but local variables must need to initialized to access.
//Except final no other modifier will not acceptable for local variables.
//(Stack area)

public class TypesOfVariablesDemo {

	static String orgName = "Vcube";// static + Object
	static int orgId = 555; // static + Primitive

	int id = 123;// instance + primitive
	String name = "Raj";// instance + Object

	public static void main(String[] args) {

		String orgName = "VSS";// local + Object
		int orgId = 666;// local + primitive

		TypesOfVariablesDemo t1 = new TypesOfVariablesDemo();

		System.out.println("local values can access directly ");
		System.out.println(orgId);
		System.out.println(orgName);

		System.out.println("static values can access By duing class name also ");
		System.out.println(TypesOfVariablesDemo.orgId);
		System.out.println(TypesOfVariablesDemo.orgName);

//		The static field TypesOfVariablesDemo.orgId should be accessed in a static way
//		The static field TypesOfVariablesDemo.orgName should be accessed in a static way
		System.out.println("static values can access by using object reference variables also but not recommended.");
		System.out.println(t1.orgId);
		System.out.println(t1.orgName);

		TypesOfVariablesDemo t2 = null;
		System.out.println(t2.orgId);
		System.out.println(t2.orgName);

		System.out.println(t2.id);// NPE

		System.out.println("main method ended !!");
	}
}
