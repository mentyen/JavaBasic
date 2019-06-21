package com.class17Method;

public class NoMainMathod {
	String str;
	int num=5;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello Friends");
	}
	void buy() {
		System.out.println("Buy");
		
	}
	void howAreYou() {
		System.out.println("How are you?");
	}
	
	public static void main(String[] args) {//method signature
		//incapsulation all that inside the method
		NoMainMathod obj=new NoMainMathod();//method body
		obj.hello();
		obj.buy();
		
		
		
	}

}
