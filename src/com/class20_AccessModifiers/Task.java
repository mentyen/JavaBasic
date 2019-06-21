package com.class20_AccessModifiers;

import java.util.Scanner;

public class Task {
	
	
	void res(String name,String lastName,String email) {
		String result=name+lastName+"@"+email;
		System.out.println(result.toLowerCase());
	}
	String res1(String name,String lastName,String email) {
		String result1=name+lastName+"@"+email+".com";
		return result1.toLowerCase();
	}
	
	
	public static void main(String[] args) {
		Task a=new Task();
		String email=a.res1("John", "Smith", "gmail");
		System.out.println(result("Vasya","Pupkin","yahoo.com"));
		a.res("bob", "moss", "outlook");
		System.out.println(email);
	
	}
	
	static String result(String name,String lastName,String email) {
		String str=name+lastName+"@"+email+".com";
		return str.toLowerCase();
	}
	
	

}
