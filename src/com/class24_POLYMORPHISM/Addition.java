package com.class24_POLYMORPHISM;

public class Addition {
	
	//Overloading is when we are talking about method signature or parameters
	//1.overloading by changing number of parameters
	public void add(int a,int b) {
		System.out.println("adding 2 int");
		System.out.println(a+b);
	}
	public void add(int a) {
		System.out.println("adding int+100");
		System.out.println(a+100);
	}
	public void add(int a,int b,int c) {
		System.out.println("adding 3 int");
		System.out.println(a+b+c);
	}
	//2. and by changing type of parameters
	public void add(double a,double b) {
		System.out.println("ading together 2 double");
		System.out.println(a+b);
	}
	public void add(int a,double b) {
		System.out.println("ading together int and double");
		System.out.println(a+b);
	}
	public void add(double a,int b) {
		System.out.println("ading together  double and int");
		System.out.println(a+b);
	}
	public void add(double a,double b,double c) {
		System.out.println("adding 3 double");
		System.out.println(a+b+c);
	}
	

}
