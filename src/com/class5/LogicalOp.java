package com.class5;

import java.util.Scanner;

public class LogicalOp {
	public static void main(String[] args) {
		boolean sale;
		int discount = 0;
		double finalPrice = 0;
		double price;

		Scanner input = new Scanner(System.in);

		System.out.println("Does sale happen?");
		sale = input.nextBoolean();

		if (sale) {
			System.out.println("Enter your price:");
			price = input.nextInt();
			System.out.println("Lets check all discounts");

			if (price < 20) {
				discount = 20;
				finalPrice = price - (price * 0.2);

			} else if (price >= 20 && price < 100) {
				discount = 30;
				finalPrice = price - (price * 0.3);
			} else if (price >= 100 && price < 500) {
				discount = 50;
				finalPrice = price - (price * 0.5);
			}
			
			System.out.println("Your discount will be:"+discount+" and your cost will down to: " +finalPrice);
		}
			else{
				System.out.println("Not interesting");
			}

		}

	}


