package com.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your numbers:");
		
		double i=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		if(i!=b&&b!=c) {
			if(i>b&&i>c) {
				System.out.println(i);
						
			}
			else if(b>i&&b>c) {
				
				System.out.println(b);
				
			}
			else {
				System.out.println(c);
			}
			
		}
		

	}

}
