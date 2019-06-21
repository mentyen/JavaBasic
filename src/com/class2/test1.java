package com.class2;

public class test1 {
public static void main(String[] args) {
	String a= "add";
	String s="Subtract";
	String m = "multiply";
	String d = "divide";
	
	double i = 3.4;
	double q = 5.7;
	
	double sum =i+q;
	double sub= i-q;
	double mult=i*q;
	double div=i/q;
	
	System.out.println("The "+ a + " of 2 numbers " +i+ " and "+q+" is equal to "+sum);
	System.out.println("The "+ s + " of 2 numbers " +i+ " and "+q+" is equal to "+sub);
	System.out.println("The "+ m + " of 2 numbers " +i+ " and "+q+" is equal to "+mult);
	System.out.println("The "+ d + " of 2 numbers " +i+ " and "+q+" is equal to "+div);
}
}
