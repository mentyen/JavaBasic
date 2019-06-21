package com.class9;

public class ContiniuCondition {
	public static void main(String[] args) {
		
		for(int i=0;i<=20;i++) {
			
			if(i%3==0) {
				System.out.println("WOW");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("hello");
	}

}
