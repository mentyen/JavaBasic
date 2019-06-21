package com.class5;

import java.util.Scanner;

public class NesetIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		
		boolean creditCard=true;
		int ballance=1000;
		
		
		if(creditCard) {
			if(ballance>1000) {
				System.out.println("pay off");
							}
			else {
				System.out.println("you are good");
			}
		}
		else {
			System.out.println("Do yo need one?");
		}

	}

}
