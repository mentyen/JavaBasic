package com.class4;


import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args)  {
	
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter your number:");
		int num1 = scan.nextInt();
		System.out.println("Enter another number:");
		int num2 =scan.nextInt();
		
		
		if(num1>num2) {
			System.out.println("Number "+num1+" larger then "+num2);
		}
		else if(num1==num2) {
			System.out.println("Numbers are equals.");
		}
		else {
			System.out.println("Number "+num2+" larger then "+num1);
		}
		System.out.println();
		
		System.out.println("Well done!");
		
		
	}

}
