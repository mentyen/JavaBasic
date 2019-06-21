package com.class26_THIS;

public class This__Method {
	public void m1() {
		System.out.println("I am M1 method");
	}
	public void m2() {
		System.out.println("I am M2 method");
		m1();
	}
	public static void main(String[] args) {
		This__Method obj=new This__Method();
		obj.m2();
	}

}
