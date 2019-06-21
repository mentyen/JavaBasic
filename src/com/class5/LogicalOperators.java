package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11000;
		
		if(num>1 && num<=10) {
			System.out.println("number is small");
			
		}
		else if(num>=11 && num<=100) {
			System.out.println("number is medium");
		}
		else if(num>=101 && num<=1000) {
			System.out.println("number is large");
		}
System.out.println("Please reenter your number");
	}
	

}
