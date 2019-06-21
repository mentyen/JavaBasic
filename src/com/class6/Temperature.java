package com.class6;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		/*
		* If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
		* otherwise--> we will not go hiking
		* If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
		* we are not going snowboarding
		* it if temperature is more than 80 & sunny--> go to the beach
		* otherwise --> not go to the beach
		*/
		Scanner input =new Scanner(System.in);
		System.out.println("what is the temperature outside");
		int temp=input.nextInt();
		boolean rain=true;
		boolean snow=true;
		boolean sunny=true;
		
		if(temp>=40&&temp<=80) {
			System.out.println("Is it raining?");
			rain=input.hasNextBoolean();
			if(rain) {
				System.out.println("We will not go for hiking");
			}
			else {
				System.out.println("We will go for hiking");
			}
			
		}
		if(temp>=25&&temp<40) {
			System.out.println("Is it snowing?");
			snow=input.hasNextBoolean();
			if(snow) {
				System.out.println("Going snowboarding otherwise");
			}
			else{
				System.out.println("We are not going snowboarding");
				
			}
		}
		if(temp>80) {
			System.out.println("Is it sunny?");
			sunny=input.hasNextBoolean();
			if(sunny) {
				System.out.println("Go to the beach");
			}
			else {
				System.out.println("Not go to the beach");
			}
		}
		
		

	}

}
