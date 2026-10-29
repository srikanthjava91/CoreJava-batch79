package com.logicalstatements;

import java.util.Scanner;

//WA POC to provide a Invoice based on your purchase the fruits or vegetables ..?
public class TestLSDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		String yn = "";
		double total_price = 0;

		do {
			System.out.println("Enter the Category ");
			String catg = sc.next();

			switch (catg) {
			case "fruits" -> {
				String fyn = "";
				double all_fruits_price = 0;

				do {
					System.out.println("Enter Fruit Item :");
					String fruit_item = sc.next();

					switch (fruit_item) {

					case "orn" -> {
						System.out.println("Orange 1kg = 100rs");
						double ornPrice = 100;
						all_fruits_price += ornPrice;
					}
					case "mng" -> {
						System.out.println("Mango Per 1kg = 200rs");
						double mngPrice = 200;
						all_fruits_price += mngPrice;
					}

					case "app" -> {
						System.out.println("Apple 1kg = 150rs");
						double appPrice = 150;
						all_fruits_price += appPrice;
					}

					case "ban" -> {
						System.out.println("Banana 1kg = 60rs");
						double banPrice = 60;
						all_fruits_price += banPrice;
					}

					case "grs" -> {
						System.out.println("Grapes 1kg = 80rs");
						double grsPrice = 80;
						all_fruits_price += grsPrice;
					}

					case "pnp" -> {
						System.out.println("Pineapple 1 piece = 70rs");
						double pnpPrice = 70;
						all_fruits_price += pnpPrice;
					}

					case "wml" -> {
						System.out.println("Watermelon 1 piece = 50rs");
						double wmlPrice = 50;
						all_fruits_price += wmlPrice;
					}

					case "pap" -> {
						System.out.println("Papaya 1kg = 60rs");
						double papPrice = 60;
						all_fruits_price += papPrice;
					}

					case "str" -> {
						System.out.println("Strawberry 1 box = 120rs");
						double strPrice = 120;
						all_fruits_price += strPrice;
					}

					case "pgr" -> {
						System.out.println("Pomegranate 1kg = 180rs");
						double pgrPrice = 180;
						all_fruits_price += pgrPrice;
					}

					case "gva" -> {
						System.out.println("Guava 1kg = 90rs");
						double gvaPrice = 90;
						all_fruits_price += gvaPrice;
					}

					case "kwi" -> {
						System.out.println("Kiwi 1kg = 250rs");
						double kwiPrice = 250;
						all_fruits_price += kwiPrice;
					}
					default -> System.out.println("Entered Item is not available : ");
					}

					System.out.println("Do you want to continue ..? Click Y for Yes N for No");
					fyn = sc.next();
				} while (fyn.equalsIgnoreCase("y"));

				System.out.println("Total Fruits Price is : " + all_fruits_price);
				total_price += all_fruits_price;
			}

			case "veg" -> {
				String vyn = "";
				double veg_price = 0;

				do {
					System.out.println("Enter the veg Item");
					String veg_item = sc.next();

					switch (veg_item) {

					case "tmt" -> {
						System.out.println("Tomato Per kg = 50/- rs");
						double tmt_price = 50.0;
						veg_price += tmt_price;

					}
					case "pot" -> {
						System.out.println("Potato Per kg = 40/- rs");
						double pot_price = 40.0;
						veg_price += pot_price;
					}

					case "on" -> {
						System.out.println("Onion Per kg = 60/- rs");
						double on_price = 60.0;
						veg_price += on_price;
					}

					case "car" -> {
						System.out.println("Carrot Per kg = 50/- rs");
						double car_price = 50.0;
						veg_price += car_price;
					}

					case "cab" -> {
						System.out.println("Cabbage Per kg = 35/- rs");
						double cab_price = 35.0;
						veg_price += cab_price;
					}

					case "cau" -> {
						System.out.println("Cauliflower Per kg = 45/- rs");
						double cau_price = 45.0;
						veg_price += cau_price;
					}

					case "brj" -> {
						System.out.println("Brinjal Per kg = 40/- rs");
						double brj_price = 40.0;
						veg_price += brj_price;
					}

					case "lad" -> {
						System.out.println("Lady Finger Per kg = 55/- rs");
						double lad_price = 55.0;
						veg_price += lad_price;
					}

					case "chi" -> {
						System.out.println("Green Chilli Per kg = 80/- rs");
						double chi_price = 80.0;
						veg_price += chi_price;
					}

					case "cuc" -> {
						System.out.println("Cucumber Per kg = 30/- rs");
						double cuc_price = 30.0;
						veg_price += cuc_price;
					}

					case "spi" -> {
						System.out.println("Spinach Per bunch = 20/- rs");
						double spi_price = 20.0;
						veg_price += spi_price;
					}

					default -> System.out.println("Entered Vegetable is not availble !!");

					}
					System.out.println("Do you want to continue ..? Click Y for Yes N for N");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Total vegetables Price is : " + veg_price);
				total_price += veg_price;
			}

			}

			System.out.println("Do you want to continue with Category ..? Click Y for Yes N for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Total Price is : " + total_price);

	}

}
