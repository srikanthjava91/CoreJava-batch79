package com.logicalstatements.loops;

//WAP to print 10 to 0 numbers ..? 
public class TestLPDemo2 {

	public static void main(String[] args) {

		for (int i = 10; i >= 0; i--) {
			if (i % 2 == 1 && i != 0) {
				System.out.println(i);
			}

		}

	}

}
