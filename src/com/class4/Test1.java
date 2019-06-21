package com.class4;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please let me know your age:");
	int age=input.nextInt();
	
	if(age<18) {
		System.out.println("To soon for your Driver licence.");
	}
	else {
		System.out.println("I will issue you a driver licence.");
	}
}
}
