package com.languagefundamentals.methods;

import java.util.Scanner;

//
public class EmployeeSalaryInfo {

	Scanner sc = new Scanner(System.in);

	void main(String[] args) {
		System.out.println("main method started ");

		double bs = getBasic();
		double hra = getHouseRentAllowance();
		double lta = getLeaveTravleAssistance();
		double mc = mealCoupons();
		double pf = getPF();
		double gt = getGratuity();

		System.out.println("Total Fixed Compensation" + (bs + hra + lta + mc + pf + gt));
		System.out.println("main method ended ");
	}

	double getBasic() {
		System.out.println("Enter Basic Salary : ");
		double basic = sc.nextDouble();
		return basic;
	}

	double getHouseRentAllowance() {
		System.out.println("Enter HRA : ");
		double hra = sc.nextDouble();
		return hra;
	}

	double getLeaveTravleAssistance() {
		System.out.println("Enter LTA : ");
		double lta = sc.nextDouble();
		return lta;
	}

	double mealCoupons() {
		System.out.println("Enter meal amount : ");
		double mealCoupons = sc.nextDouble();
		return mealCoupons;
	}

	double getPF() {
		System.out.println("Enter PF amount : ");
		double pf = sc.nextDouble();
		return pf;
	}

	double getGratuity() {
		System.out.println("ENter Gratuity : ");
		double gt = sc.nextDouble();
		return gt;
	}

}
