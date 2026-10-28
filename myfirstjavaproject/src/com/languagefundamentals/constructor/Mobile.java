package com.languagefundamentals.constructor;

public class Mobile {

	String model;
	String brand;
	String color;
	double price;
	int year;

	// Instance Block
//	{
//		System.out.println("Instance block called");
//	}

	// No-arg constructor
	Mobile() {
		this("unknown");
	}

	// One-arg constructor
	Mobile(String model) {
		this(model, "unknown");

	}

	// Two-arg constructor
	Mobile(String model, String brand) {
		this(model, brand, "unknown");
	}

	// Three-arg constructor
	Mobile(String model, String brand, String color) {
		this(model, brand, color, 100000.00);
	}

	// Four-arg constructor
	Mobile(String model, String brand, String color, double price) {
		this(model, brand,color, price,2020);
	}

	// Five-arg constructor
	Mobile(String model, String brand, String color, double price, int year) {
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	public static void main(String[] args) {

		System.out.println("Main method started");

		Mobile m = new Mobile();
		m.mobileInfo();

		Mobile m1 = new Mobile("iPhone 17");
		m1.mobileInfo();

		Mobile m2 = new Mobile("Galaxy S26", "Samsung");
		m2.mobileInfo();
//
		Mobile m3 = new Mobile("Pixel 10", "Google", "Black");
		m3.mobileInfo();
//
		Mobile m4 = new Mobile("OnePlus 15", "OnePlus", "Green", 65000.00);
		m4.mobileInfo();
//
		Mobile m5 = new Mobile("iPhone 17 Pro", "Apple", "Silver", 130000.00, 2026);
		m5.mobileInfo();

		System.out.println("Main method ended");
	}

	void mobileInfo() {
		System.out.println("Model of Mobile : " + model);
		System.out.println("Brand of Mobile : " + brand);
		System.out.println("Color of Mobile : " + color);
		System.out.println("Price of Mobile : " + price);
		System.out.println("Year of Mobile : " + year);
		System.out.println("************************************");
	}
}
