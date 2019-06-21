package com.class20_AccessModifiers;

public class AccessModifiers {
	private String name="John";
	String name1="Vasya";
	protected String name2="Murzik";
	public String name3="Masic";
	
		
	
	void sayHello() {
		System.out.println("Hello students");
	}
	
	//Reverse string
	protected String list(String a) {
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		return rev;
	}
	//Return palindrome
	public boolean palindrome(String str) {
		/*
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		*/
		String rev=list(str);
		if(str.equalsIgnoreCase(rev)) {
		return true;
	}
		else{return false;}
	
	
	}
	//Return an Array of words
	private String[]array(String a) {
		String []array=a.split(" ");
			return array;
	}
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		String[]a=obj.array("What a beatiful world");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"*");
		}
		for(Object word:a) {
			System.out.println(word);
		}

}}
