package com.class14_StringManipulation;

import java.util.Scanner;

public class PrimeNumber {
@SuppressWarnings("unused")
public static void main(String[] args) {
	//Prime number or not
	//should be divisible by 1 and by its self only
	//2,3,5,7,11,13,17,19,29
	
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=input.nextInt();

    boolean prime =true;
	for(int i=2;i<num;i++) {
		if(num%i!=0) {
			System.out.println(prime);
		}
		else prime=false;
		break;
	}
	System.out.println(prime);
	
}
}
