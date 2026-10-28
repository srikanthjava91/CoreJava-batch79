package com.logicalstatements;

import java.util.Scanner;

//WAP to print Cricketer Info Based on his Jersey Number ..? 
public class TestLSDemo7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey Number : ");
		int jno = sc.nextInt();

		switch (jno) {

		case 7:
			System.out.println("MSD : Mahendra SIngh Dhoni");
			System.out.println("Thala For a Reason : Cool Captain & Wicket Keeper ");
			break;
		case 18:
			System.out.println("VK : Virat Kohli ");
			System.out.println("Aggressive Cricketer : Great Batsman : GOAT");
			break;
		case 45:
			System.out.println("RS : Rohit Sharma : ");
			System.out.println("Hitman : Boss ");
			break;
		case 4:
			System.out.println("AB : Abhisheik Sharma");
			System.out.println("PULI : Aya Sher");
			break;
		case 1:
			System.out.println("KL : K Lokesh Rahul");
			System.out.println("Classic Player ");

		default:
			System.out.println("Entred Jersy Number is not availble in my list : ");
		}

	}

}
