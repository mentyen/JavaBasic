package com.class24_POLYMORPHISM;

public class TestOfMainOverload {
	public static void main(String[] args) {
		MainMethodOverload.main();
		String[]args1= {"Hello","and","Buy"};
		int[]args2= {1,2,3};
		MainMethodOverload.main(args2);
		System.out.println(args1);
	}

}
