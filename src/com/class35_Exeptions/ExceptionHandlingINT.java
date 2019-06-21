package com.class35_Exeptions;

public class ExceptionHandlingINT {
	public static void main(String[] args) {
		System.out.println("Begining of the code");
		int a=10;
		int b=-10;
		try {
			System.out.println(a/b);
			System.out.println("Cod inside the try block");
		}
		catch(ArithmeticException e) {
			System.out.println("I am a catch code");
			e.getMessage();
		}
		
		
		System.out.println("End of the code");
	}

}
