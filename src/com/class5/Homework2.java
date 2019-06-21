package com.class5;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your numbers:");
		
		double i=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		if(i>b) {
			if(i>c) {
				System.out.println(i);
			}
			else {
				System.out.println(c);
			}
				
		}
		else if(b>c) {
			System.out.println(b);
			
		}
		else {
			System.out.println(c);
		}
	}
	

}
