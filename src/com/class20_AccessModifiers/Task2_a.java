package com.class20_AccessModifiers;

public class Task2_a {
	public static void main(String[] args) {
		Task2 obj=new Task2();
		String rev=obj.list("Name");
		System.out.println(rev);
		
		boolean palindrome=obj.palindrome("moom");
		System.out.println(palindrome);
	}

}
