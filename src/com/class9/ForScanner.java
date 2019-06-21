package com.class9;

import java.util.Scanner;

public class ForScanner {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 2 integers 5 times");
				
		for(int i=0;i<=5;i++) {
		int i1=input.nextInt();
		int b=input.nextInt();
		
		
		if(i1>b) {
			System.out.println(i1 +" is the largest");			
		}
		if(b>i1) {
			System.out.println(b +" is the largest");
		}
		else {
			System.out.println("numbers are even");
			}
		
	}
	}}

