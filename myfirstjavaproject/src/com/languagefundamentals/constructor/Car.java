package com.languagefundamentals.constructor;

public class Car {

	String model;
	String brand;
	String color;
	double price;
	int year;

	Car() {
		System.out.println("No-arg constructors called ");
		model = "unknown";
		brand = "unknown";
		color = "unknown";
		price = 400000.00;
		year = 2020;
	}

	Car(String model, String brand, String color, double price, int year) {
		System.out.println("Parameterized consructor called ");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Car c1 = new Car();
		c1.carInfo();

		Car c2 = new Car("Sonet", "KIA", "RED", 1500000.00, 2025);
		c2.carInfo();
	}

	void carInfo() {
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Color of the Car : " + color);
		System.out.println("Price of the Car : " + price);
		System.out.println("Year of the Car : " + year);
		System.out.println("*******************************");

	}
}
