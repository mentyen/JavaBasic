package com.class36_Exeption;

public class ThrowKeyword {
	public static void main(String[] args) {
		int a=10,b=0;
		
		
		//System.out.println(a/b);// object of ArithmeticException was created
		chechAgeEligibility(44);
		twoNumDivision(1,20);
		userName("aiyaiyai");
	}
	public static void chechAgeEligibility(int age) {
		if(age>=18) {
			System.out.println("Issue a ID");
		}
		else {
			throw new ArithmeticException("Not eligible to get an ID");// we create a object and throw in it in to the user
		}
	}
	
	public static void twoNumDivision(int a,int b) {
		
	if(b!=0) {
		System.out.println(a/b);
	}else {
		throw new ArithmeticException("Can not divide by 0");
	}
	}
	
	static void userName(String name) {
		if(name.length()>4) {
			System.out.println("Good");
		}else {
			throw new NullPointerException("TO short");
		}
	}

}
