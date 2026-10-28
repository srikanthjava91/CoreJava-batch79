package com.languagefundamentals.constructor;

class Product extends Object{

	String model;
	String brand;
	String color;
	double price;
	
	public Product() {
		super();
		System.out.println("No arg constructor called from Product");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Product !!");
	}

}


//In Every Constructor in a Java programs, JVM calls the super() by default whether we called explicitly or not.
public class Laptop extends Product {
	
	public Laptop() {
		System.out.println("No arg constructor called form Laptop");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Laptop !!");
		Laptop l = new Laptop();
		l.laptopInfo();
	}

	void laptopInfo() {
		System.out.println("Model of the Laptop : " + model);
		System.out.println("Brand of the Laptop : " + brand);
		System.out.println("Color of the Laptop : " + color);
		System.out.println("Price of the Laptop : " + price);
	}

}
