package com.languagefundamentals.constructor;

class Sport {

	int teamSize;
	String rules;
	long timeInseconds;

	public Sport(int teamSize, String rules, long timeInseconds) {
		System.out.println("Sport parameterized Consructor called !!");
		this.teamSize = teamSize;
		this.rules = rules;
		this.timeInseconds = timeInseconds;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
	}
}

//If in the Parent class there are only Parameterized constructors, 
//then we cannot extends and create the Object of Child class, because, 
//Parent class does not contains no-arg constructor or default constructor.
public class Cricket {
	
	public Cricket() {
//		super();
		System.out.println("Cricket No-arg Consructor called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Cricket c1 = new Cricket();
	}

}
