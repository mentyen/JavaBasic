package com.class6;

import java.util.Scanner;

public class SwitchHomework {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		System.out.println("Please enter your favorite car make");
		String car=input.nextLine();
		String duty="unknown";
		
		switch(car) {
		case "BMW":
			duty="german car";
			break;
		case "Toyota":
			duty="japanese car";
			break;
		case "Maserati":
			duty="italian car";
			break;
		
					
		}
		System.out.println("Your favorite car is "+duty);
		}
						
	}
	
	


