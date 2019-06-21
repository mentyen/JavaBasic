package com.class35_Exeptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2Static {
	
	static List<Exception> listOfexception() {
		List<Exception>list=new ArrayList();
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			list.add(e);
		}
		int[]array= {1,2,3};
		try {
		System.out.println(array[5]);
		}catch(IndexOutOfBoundsException e) {
			list.add(e);
		}
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		try {
			int num=input.nextInt();
		}catch(InputMismatchException e) {
			list.add(e);
		}
		
		String str=null;
		try {
			System.out.println(str.length());
			
		}catch(NullPointerException e) {
			list.add(e);
		}


	   return list;
		
				
	}
	public static void main(String[] args) {
		
		List<Exception>list=listOfexception();
		System.out.println(list.size());
		for(Exception x:list) {
			System.out.println(x);
		}
		
	}

}
