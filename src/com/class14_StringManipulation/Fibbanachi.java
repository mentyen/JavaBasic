package com.class14_StringManipulation;

public class Fibbanachi {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int res=0;
		for(int i=0;i<10;i++) {
		res=a+b;
		a=b;
		b=res;
		System.out.println(res+" ");
		}
		
	}
	

}
