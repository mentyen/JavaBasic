package com.class14_StringManipulation;

import java.util.Scanner;

public class FowManyAlfaInString {
	public static void main(String[] args) {
		String str="Wh%at a beaut98iful -world";
		String str1=str.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		System.out.println(str1.length());
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		String string=input.nextLine();
		System.out.println("What part of the string would you like to print:");
		System.out.println("Start:");
		int start=input.nextInt();
		System.out.println("End:it should not be larger then "+string.length());
		int end=input.nextInt();
		
		System.out.println(string.substring(start, end));
		System.out.println("The length of the string is "+string.length());
		
		
		}

}
