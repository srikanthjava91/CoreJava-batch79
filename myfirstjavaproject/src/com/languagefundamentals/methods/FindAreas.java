package com.languagefundamentals.methods;

import java.util.Scanner;

//4) With return type + with parameters 
//WAP to find Areas of Triangle, Circle, Square & Rectangle 
//Triangle : 0.5 * base * height 
//Circle  : PI * r * r 
//Square : side * side 
//Rectangle : length * breadth 
public class FindAreas {

	void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base : ");
		double base = sc.nextDouble();

		System.out.println("Enter Height  : ");
		double height = sc.nextDouble();

		double arTriangle = findAreaOfTriangle(base, height);
		System.out.println("Area of Triangle is : " + arTriangle);

		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		double arCir = findAreaOfCircle(r);
		System.out.println("Area of Circle is  : " + arCir);

	}

	double findAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}

	double findAreaOfTriangle(double b, double h) {
		double arTri = 0.5 * b * h;
		return arTri;
	}

}
