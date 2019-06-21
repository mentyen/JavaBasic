package com.class10;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("What would you like to purchase:");
			@SuppressWarnings("unused")
			String item=input.nextLine();
			System.out.println("Please enter the item price:");
			int price=input.nextInt();
			System.out.println("Please pay for your item:");
			int paydAmmount=input.nextInt();
			
			
			
			do {
				
				int balance=price-paydAmmount;
				if(price==paydAmmount)break;
				
				else {
				System.out.printf("You need to cover the rest:%d",balance);
				System.out.println();
				System.out.println("Please pay the differents:");
				paydAmmount+=input.nextInt();
				}
				
			}	
			while(paydAmmount<price);
				
				System.out.println("Thank you for shopping");
				
			if(paydAmmount>price) {
				int change=paydAmmount-price;
				System.out.printf("Your change is %d.",change);
			}
						
		}
	}


