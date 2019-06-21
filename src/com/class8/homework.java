package com.class8;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double price;
		/*
		do {
			System.out.println("Enter you amount");
			 price=input.nextDouble();
		}
		while(price!=1.99);
		
		System.out.println("God job");
			
		*/
		
		System.out.println("Enter the amount");
		price=input.nextDouble();
		while(price!=1.99) {
			System.out.println("Try again");
			price=input.nextDouble();
		}
		System.out.println("enjoy");
		
		}}
	


