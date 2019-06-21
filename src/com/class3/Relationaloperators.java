package com.class3;

public class Relationaloperators {
	public static void main(String[] args) {
		int a =198;
		int b=198;
		
		boolean result=a>b;
		boolean result1= a==b;
		
		
		
		System.out.println(result);
		System.out.println(result1);
		
		
		if(a!=b) {
			System.out.println("a is larger than b");
		}
		else {
			System.out.println("b is larger than a");
			
		}
		
		//declare price if it more then expected _ will not buy
		
		double shoePrice=39.99;
		double allowPrice=31.99;
		
		
		if(shoePrice<=allowPrice) {
			System.out.println("I am buying those shoes.");
		}
		else {
			System.out.println("I am not buying those shoes.");
		}
		
		
		System.out.println("I am continues code");
	}

}
