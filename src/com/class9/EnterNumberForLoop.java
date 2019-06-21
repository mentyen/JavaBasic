package com.class9;

import java.util.Scanner;

public class EnterNumberForLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the begining of the loop");
		int i=input.nextInt();
		System.out.println("Enter the end of the loop");
		int b =input.nextInt();
		int sum=0;
		if(i<b) {
		for(int x=i;x<=b;x++) {
			sum=sum+x;
			//System.out.println(x);
		}
		System.out.println(sum);
		input.close();
		}
		

	}

}
