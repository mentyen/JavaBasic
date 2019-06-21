package com.class14_StringManipulation;

public class StringRevers {
	public static void main(String[] args) {
		//5. Write a java program to reverse String? Reverse a string word by word?
		
		String str="Hello World Today is a Class";
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		
		
		String[] word1=str.split(" ");
		String wordReverce=" ";
		
	for(int i=word1.length-1;i>=0;i--) {
		wordReverce=wordReverce+word1[i];
	}
		
		
		
	}

}
