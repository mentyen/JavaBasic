package com.class36_Exeption;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.replace(0, 1, "Z");
		sb.reverse();
		System.out.println(sb);
		
		
		String str="Good morning";
		str.concat("John");//ne object get created"Good morning John" but no one getting the value
		System.out.println(str);
		System.out.println("-----------------------------");
		StringBuffer sb1=new StringBuffer("Good morning");
		sb1.append(" John");
		System.out.println(sb1);
	}

}
