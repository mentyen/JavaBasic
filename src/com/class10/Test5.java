package com.class10;

import java.util.Scanner;

public class Test5 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int secretNum=17;
	System.out.println("Guess the number between 10 and 20:Enter your number.");
	int num=input.nextInt();
	
	if(num>10 && num<20) {
	do {
		if (num==secretNum)break;
		if(num<secretNum) {
			System.out.println("Your number is lower then Secret Number,reenter.");
			num=input.nextInt();
		}
		else {
			System.out.println("Your number larger then a Secret Number, plese reenter.");
			num=input.nextInt();
		}
		
	}
	
	while(num!=secretNum);
	
	System.out.println("Good job!!!");
	}
	else {
		System.out.println("Stupid, follow the instructions has to be more then 10 and lees then 20.");
	}
}
}
