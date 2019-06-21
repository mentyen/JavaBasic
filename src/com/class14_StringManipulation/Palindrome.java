package com.class14_StringManipulation;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your word");
		String str=input.nextLine();
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(reverse.equals(str))System.out.println("Palindrom");
		else System.out.println("Not palindrom");
		
	}

}
