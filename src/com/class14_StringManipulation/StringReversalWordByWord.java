package com.class14_StringManipulation;

import java.util.Scanner;

public class StringReversalWordByWord {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a string");
		String str=input.nextLine();
		
		String []str1=str.split(" ");
		String res="";
		for(int i=str1.length-1;i>=0;i--) {
		   res=res+str1[i]+" ";
		}
		System.out.println(res);
	}

}
