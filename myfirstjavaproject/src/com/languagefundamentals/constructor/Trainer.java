package com.languagefundamentals.constructor;

class Person {
	int age;
	String name;
	String city;

	public Person() {
		System.out.println("Person constructor called ");
	}

	public Person(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}

}

//Either this() or super() can call but not both.
//Until Java 24 version ,this() or super() must be first line of any Constructor.
//But, After 25 onwards, this() & super() can written any where in the constructor based on Requirements.
 public class Trainer extends Person {

	
	//By using child class, we can call super() 
	Trainer() {
		super(26, "unkonwn", "unknown");
		System.out.println("Trainer constructor called !!");

	}
	

	
	Trainer(int age, String name, String city) {
		super.age = age;
		super.name = name;
		super.city = city;
	}

	public static void main(String[] args) {
		System.out.println("Trainer main method called ");
		Trainer t = new Trainer();
		t.trainerInfo();

		Trainer t1 = new Trainer(35, "Srikanth", "Hyderabad");
		t1.trainerInfo();

		System.out.println("Trainer main method ended ");
	}

	void trainerInfo() {

		System.out.println("Age of the Trainer : " + age);
		System.out.println("Name of the Trainer : " + name);
		System.out.println("City of the Trainer : " + city);
		System.out.println("******************************");

	}

}
