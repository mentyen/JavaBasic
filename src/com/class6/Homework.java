package com.class6;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		System.out.println("Are you thirsty?");
		Scanner input = new Scanner(System.in);
		boolean thirsty=input.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy=input.nextBoolean();
		
		String drink="Nothing";
		
		if(thirsty&&sleepy) {
			drink="to drink Coffee";
		}
		else if(thirsty) {
			drink="to drink Water";
		}
		else if(sleepy) {
			drink="to drink Tea";
		}
		else {
			drink="to drink Nothing";
		}
				
		System.out.println("Looks like you need "+ drink);
	}

}
