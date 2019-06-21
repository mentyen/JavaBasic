package com.class20_AccessModifiers;

public class Task2 {
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
	private String[] arr(String a) {
		String []array=a.split(" ");
			return array;
	}
	public static void main(String[] args) {
		Task2 obj=new Task2();
		String[]a=obj.arr("What a beatiful world");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"*");
		}
		for(Object word:a) {
			System.out.println(word);
		}
		
		
	}

}
