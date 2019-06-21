package com.class25_Overriding;

public final class FinalKeyWords {
	public static final String name="SYNTAX";
	
	public final void hello() {
		System.out.println("Hello from a parent class");
	}
	
	
	public static void main(String[] args) {
		/*   -------------FINAL------------
		 * 1.VARIABLE---we CANNOT change it---CONSTANT
		 * 2.METHOD-- CANNOT OVERRIDE it
		 * 3.CLASS--- CANNOT INHERITATE
		
		 */
		final String str="Hello";//this value can not be change//CONSTATNT
		//str="Buy";
		//name="School";
	
		
	}

}

//class ChildOfFinal extends FinalKeyWords {
	/*
	public final void hello() {
		System.out.println("Hello from a parent class");
	}
	*/
	
//}