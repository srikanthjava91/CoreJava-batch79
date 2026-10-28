package com.languagefundamentals.constructor;

public class Bike {

	String model;
	String brand;
	String color;
	double price;
	int year;

	{
		System.out.println("instance block called ");
	}

	// No-arg constructor
	Bike() {
		System.out.println("No arg constructor called ");
		model = "Unknown";
		brand = "Unknown";
		color = "Unknown";
		price = 100000.00;
		year = 2025;
	}

	// one-arg constructor
	Bike(String model) {
		System.out.println("one arg constructor !!");
		this.model = model;
	}

	// Two arg constructor
	Bike(String model, String brand) {
		System.out.println("two arg constructor !!");
		this.model = model;
		this.brand = brand;
	}

	// Three-arg constructor
	public Bike(String model, String brand, String color) {
		System.out.println("Three arg constructor !!");
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

	// four arg constructor
	public Bike(String model, String brand, String color, double price) {
		System.out.println("Four arg constructor called ");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	// five arg constructor
	public Bike(String model, String brand, String color, double price, int year) {
		System.out.println("Five arg constructor called ");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Bike b = new Bike();
		b.bikeInfo();

		Bike b1 = new Bike("Classic");
		System.out.println(b1.model);

		Bike b2 = new Bike("Classic", "RE");
		b2.bikeInfo();

		Bike b3 = new Bike("FZ-S", "Yamaha", "Blue");
		b3.bikeInfo();

		Bike b4 = new Bike("Shine", "Honda", "Black", 120000.00);
		b4.bikeInfo();

		Bike b5 = new Bike("Pulsar", "Bajaj", "Red", 150000.00, 2026);
		b5.bikeInfo();

		System.out.println("main method ended ");

	}

	void bikeInfo() {
		System.out.println("Model of the Bike : " + model);
		System.out.println("Brand of the Bike : " + brand);
		System.out.println("Color of the Bike : " + color);
		System.out.println("Price of the Bike : " + price);
		System.out.println("Year of the Bike : " + year);
		System.out.println("*******************************");

	}

}
