package com.class10;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please guess a leap year");
		int year=input.nextInt();
		
		for(int i=0;i<10;i++) {
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Good job this is a LeapYear");
				break;
			}
			else {
				System.out.println("Please try again.");
				year=input.nextInt();
			}
		}
		System.out.println("End of the story.");
		
	}

}
