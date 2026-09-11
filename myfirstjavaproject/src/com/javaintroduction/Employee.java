package com.javaintroduction;

public class Employee {

	// static variables
	static int org_Id = 555;
	static String org_Name = "VCUBE Software Solutions";

	// instance variables
	int eid = 101;
	String ename = "Unknown";

	public static void main(String[] args) {
		System.out.println("main method started");

		System.out.println("Accessing the static data directly !!");
		System.out.println(org_Id);
		System.out.println(org_Name);

		System.out.println("Accessing the static data by using class name ");
		System.out.println(Employee.org_Id);
		System.out.println(Employee.org_Name);

		System.out.println("Accessing the static data by using object refrence variable ");

		Employee emp1 = new Employee();
//		The static field Employee.org_Id should be accessed in a static way
		System.out.println(emp1.org_Id);
		System.out.println(emp1.org_Name);

		Employee emp2 = null;
		System.out.println(emp2.org_Id);
//		There is no impact with static data, SO that is the reason, 
//		we should access static data with class names only
		System.out.println(emp2.org_Name);

		System.out.println(emp2.eid);// NullPointerException --> null dot anything or any operation is NPE

		System.out.println("Accessing instance data by using Object reference variable ");
		emp1.eid = 102;
		emp1.ename = "Srikanth";
		System.out.println(emp1.eid);
		System.out.println(emp1.ename);

		System.out.println("main method ended");
	}
}
