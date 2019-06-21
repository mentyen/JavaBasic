package com.class10;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter a entry point:");
		int enter=input.nextInt();
		System.out.println("PLease enter the end point:");
		int summOdd=0;
		int summEven=0;
		int end=input.nextInt();
		for(int i=enter;i<=end;i++) {
			if(i%2==0) {
				summOdd=summOdd+i;
			}
			else {
				summEven=summEven+i;
			}
		}
		System.out.printf("Sum of the odd numbers is:%d,and the even is:%d",summOdd,summEven);
	}

}
