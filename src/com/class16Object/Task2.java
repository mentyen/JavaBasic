package com.class16Object;

public class Task2 {
	String text;
	
	void reverseString() {
		String a="seigolonhceT xatnyS";
		//String []b=a.split("");
		String reverse="";
		//for(int i=b.length-1;i>0;i--) {
		//	reverse=reverse+b[i];
		//}
		for(int i=a.length()-1;i>=0;i--) {
			reverse+=a.charAt(i);
		}
		System.out.println(reverse);
		
	}

	
	public static void main(String[] args) {
		Task2 a1=new Task2();
		a1.reverseString();
		
		
	}
}
