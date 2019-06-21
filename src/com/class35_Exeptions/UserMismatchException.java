package com.class35_Exeptions;

import java.util.Scanner;

public class UserMismatchException {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your age");
		
		
		try {
		
			int userInput=input.nextInt();System.out.println(userInput);
			
			
		}catch(Exception e) {
			System.out.println("Catch");
			e.printStackTrace();
		}
		
		System.out.println("End of the cod");
	}

}
