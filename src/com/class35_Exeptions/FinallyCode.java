package com.class35_Exeptions;

public class FinallyCode {
	public static void main(String[] args) {
		int a=10;int b=0;
		try {
			System.out.println("Try block");
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Catch block");
		}finally {
			System.out.println("Finally block");
		}
		
	}

}
