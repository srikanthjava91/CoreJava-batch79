package com.logicalstatements;

import java.util.Scanner;

//WAP to manage Attendance based on the Criteria..
public class TestLSDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Are you Regular for classes ..?");
		boolean areYouAttendingClassesRegularly = sc.nextBoolean();

		System.out.println("Are you attending lab sessions daily ..? ");
		boolean areYouAttendingLasSessionsDaily = sc.nextBoolean();

		System.out.println("Are you completing every week exams without fail ..? ");
		boolean areYouAttendingWeeklyExams = sc.nextBoolean();

		System.out.println("Are You Attending Mocks Every Week ..? ");
		boolean areYouAttendingMockEveryWeek = sc.nextBoolean();

		if (areYouAttendingClassesRegularly && areYouAttendingLasSessionsDaily && areYouAttendingWeeklyExams
				&& areYouAttendingMockEveryWeek) {
			System.out.println("You will get a Job in 6 months without fail !!");
		}else {
			System.out.println("You are Cheating your parent directly !!");
			System.out.println("You will not a get job in 6 months,.. it will come once you Realized... ");
		}

		sc.close();
		
	}
}
