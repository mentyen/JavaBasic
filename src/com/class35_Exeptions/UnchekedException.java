package com.class35_Exeptions;

public class UnchekedException {
	public static void main(String[] args) {
		int[]array= {12,13,14};
		//System.out.println(array[3]);//java.lang.ArrayIndexOutOfBoundsException:
		
		new ArrayIndexOutOfBoundsException();
		
		String a="Hello";
		//System.out.println(a.charAt(7));//java.lang.StringIndexOutOfBoundsException:
		
		new StringIndexOutOfBoundsException();
		
		String str=null;
		System.out.println(str.length());//java.lang.NullPointerException
		
		new NullPointerException();
		
	}

}
