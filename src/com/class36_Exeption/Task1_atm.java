package com.class36_Exeption;

public class Task1_atm {
	public static void atm(int balance,int withdraw) {
		if(withdraw<balance) {
			System.out.println("Here ids your "+withdraw+".00$");
		}else {
			throw new ArithmeticException("Your balance is to low");
		}
		
	}
	
	static void fun() {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			System.out.println("First catch in FUN");
			throw e;
		}
	}
	public static void main(String[] args) {
		atm(3000,700);
		try {
			fun();
		}catch(ArithmeticException e) {
			System.out.println("Second catch in Main");
		}
	}

}
