package com.class17Method;

import java.util.Scanner;

public class Greeting {
	
	 void hello() {//without parameters
		System.out.println("Hello");
	}
	 void findLargest(int a,int b) {//has parameters a and b
		  
		 if(a>b)System.out.println("A is larger then B");
			else System.out.println("B larger then A");
			
	 }
	 void hello_To_instructor(String name) {//method signature
		 System.out.println("Hello "+name);//method body
	 }
	public static void main(String[] args) {
	     Greeting obj=new Greeting();
	     @SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
	     System.out.println("Enter your numbers");
	     obj.findLargest(in.nextInt(),in.nextInt());
	    // obj.findLargest(34,5);
	     obj.hello_To_instructor("Asel");
	
		
	}

}
