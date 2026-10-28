package com.languagefundamentals.constructor;

public class Movie {

	String name;
	String hero;
	String director;
	String heroine;
	double budget;
	
	Movie(){
		System.out.println("No-arg constructor called ");
	}

	Movie(Movie m){
		this.name =m.name;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.director = m.director;
		this.budget = m.budget;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started !!");

		Movie m = new Movie();
		m.director = "SS Rajamouli";
		m.hero = "Mahesh Babu";
		m.heroine = "Priyanka Chopra";
		m.name = "Varanasi";
		m.budget = 5000000000.00;

		m.movieInfo();
		
		Movie m1 = new Movie(m);
		m1.movieInfo();

		System.out.println("main method ended !!");

	}

	void movieInfo() {
		System.out.println("Name of the Movie : " + name);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("Heroine of the Movie : " + heroine);
		System.out.println("Director of the Movie : " + director);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("****************************************");

	}

}
