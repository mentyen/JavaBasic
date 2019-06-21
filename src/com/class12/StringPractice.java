package com.class12;

public class StringPractice {
public static void main(String[] args) {
	 String para = "The quick brown fox jumps over the lazy dog.";
	 
	System.out.println(para.toLowerCase());
	System.out.println(para.toUpperCase());
	if(para.startsWith("The")&&para.endsWith("The"))System.out.println(true);
	
	int sum=0;
	for(int i=0;i<para.length();i++) {
	if(para.charAt(i)=='a') {
		sum++;
		}}
	System.out.println(sum);
	
	System.out.println(para.substring(para.length()/2));
	System.out.println(para.substring(10, 20));
	System.out.println(para.trim());
	
	String reverse="";
	for(int i=para.length()-1;i>=0;i--) {
		 reverse=reverse+para.charAt(i);
	}
	System.out.println(reverse);
	
}
}
