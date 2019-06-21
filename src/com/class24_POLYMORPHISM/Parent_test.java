package com.class24_POLYMORPHISM;

public class Parent_test {
	int a;
	Parent_test(){
		a=12;
		System.out.println("I am a constructor ");
		
	}
	
	Parent_test(String a){
		System.out.println("I am a constructor "+a);
		
	}
	static void instatnceVariable() {
		System.out.println("i am static");
	}
	private String privateString() {
		String a="Private";
		return a;
	}
	protected int pro() {
		return 0;
	}
	

}
