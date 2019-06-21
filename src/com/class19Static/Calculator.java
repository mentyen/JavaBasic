package com.class19Static;

public class Calculator {
	
	static int sum(int a,int b,int c) {
		return a+b+c;
	}
	static int average(int a,int b,int c) {
		return (a+b+c)/3;
	}
	static int max(int a,int b,int c) {
		int max =a;
		if(b>a) {
			max=b;}
		if(c>max) {
			max=c;
		}
		
		return max;
	}
	 
	
	public static void main(String[] args) {
		System.out.println(sum(12,4,4));
		System.out.println(average(88,-9,49));
		System.out.println(max(-1,32222,400));
		
	}

}
