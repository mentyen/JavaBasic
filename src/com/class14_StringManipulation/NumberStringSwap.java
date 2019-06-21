package com.class14_StringManipulation;

public class NumberStringSwap {
	public static void main(String[] args) {
		int a=10;int b=30;
		a=a+b;
		b=a-b;//b=10
		a=a-b;//a=30
		
		String str="Boss";String str1="Mossya";
		str=str+str1;
		System.out.println(str);
		
		str1=str.substring(0, str.length()-str1.length());
		System.out.println(str1);
		str=str.substring(str1.length());
		System.out.println(str);
	}

}
