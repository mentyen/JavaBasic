package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter yor age:");
		int age = input.nextInt();
		
		if (age >= 1 && age<3) {
			System.out.println("You are Baby");
		} else if (age >= 3 && age < 5) {
			System.out.println("toddler");

		} else if (age >= 5 && age < 13) {
			System.out.println("kid");
		} else if (age >= 13 && age < 20) {
			System.out.println("teenager");
		} else if (age >= 20 && age < 64) {
			System.out.println("adult");
		} else if (age >= 64) {
			System.out.println("senior");
		}

	}
}
