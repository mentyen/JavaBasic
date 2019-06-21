package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {
	
	void sum(int x,int y) {
		System.out.println(x+y);
		
	}
	void sub() {
		int a=1,b=10;
		System.out.println(b-a);
		
	}
	public int summ(int y,int x) {
	
		return (x+y);
		
	}
	
	public static void main(String[] args) {
		ScannerMethod obj=new ScannerMethod();
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter yur numbers");
		
		obj.sum(input.nextInt(),input.nextInt());
		obj.sub();
		
		
		
	}

}
