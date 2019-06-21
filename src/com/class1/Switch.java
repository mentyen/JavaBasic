package com.class1;

public class Switch {
	public static void main(String[] args) {
		int a =3;
		int b=8;
		double res=0;
		
		char operator='-';
		
		
		switch(operator) {
		case'+':res=a+b;break;
		case'-':res=a-b;break;
		case'*':res=a+b;break;
		case'/':res=a+b;break;
		default:res=Double.NaN;
		}
		//default 
		System.out.println(a+String.valueOf(operator)+b+"="+res);
	}

}
