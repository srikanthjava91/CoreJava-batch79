package com.languagefundamentals;

class Employee {

	int eid = 123;
	String ename = "Srikanth";
	double esal = 100000;
	int age = 22;
	Address address = new Address();

}

class Address {
	String flat = "LIG-123";
	String plot = "LIG";
	String street = "KPHB";
	String city = "HYD";
	String state = "TG";
	int pinocde = 500072;

}

public class TestDataTypesDemo4 {

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		System.out.println(emp.age);
		System.out.println(emp.esal);

		System.out.println(emp.address.flat);
		System.out.println(emp.address.plot);
		System.out.println(emp.address.street);
		System.out.println(emp.address.city);
		System.out.println(emp.address.state);
		System.out.println(emp.address.pinocde);
		

	}

}
