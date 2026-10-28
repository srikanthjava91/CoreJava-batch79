package com.languagefundamentals.constructor;

public class Employee {

	int eid;
	String ename;
	double esal;

	Employee(){
		System.out.println("no arg constructor started  ");
		
		eid = 100;
		ename = "unknonwn";
		esal = 10000.00;
		
		System.out.println("no arg constructor ended ");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started !!");

		Employee e1 = new Employee();
		e1.empInfo();
		
		Employee e2 = new Employee();
		e2.ename = "Veera Babu";
		e2.esal = 500000.00;
		e2.empInfo();
		
		Employee e3 = new Employee();
		e3.ename = "Sathwik";
		e3.empInfo();

		System.out.println("main method ended !!");
	}

	void empInfo() {
		
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esal);
		System.out.println("********************************");
	}

}
