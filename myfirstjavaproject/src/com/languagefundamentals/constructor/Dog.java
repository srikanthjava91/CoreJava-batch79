package com.languagefundamentals.constructor;

//this & super are the keyword in java
//this is a keyword to invoke current class Object data members.
//super is the keyword to invoke Parent class object data members.
//this & super we can use in instance methods & constructors but not in static methods.

class Animal {
	int age = 5;
	String breed = "Labrador Retriever";

	public static void main(String[] args) {
		System.out.println("main metod started from Animal ");
	}
}

public class Dog extends Animal {
	int age = 6;
	String breed = "German Shepherd";

	public static void main(String[] args) {
		System.out.println("main method strated from Dog");
		Dog d = new Dog();
		d.dogInfo();

////		CE : Cannot use super/this in a static context
//		System.out.println("Age of the Dog : " + super.age);
//		System.out.println("breed of the Dog : " + super.breed);
//		
//		System.out.println("************Child ****************");
//		System.out.println("Age of the Dog : " + this.age);
//		System.out.println("breed of the Dog : " + this.breed);
		
	}

	void dogInfo() {
		System.out.println("Age of the Dog : " + super.age);
		System.out.println("breed of the Dog : " + super.breed);
		
		System.out.println("************Child ****************");
		System.out.println("Age of the Dog : " + this.age);
		System.out.println("breed of the Dog : " + this.breed);
		
	}

}
