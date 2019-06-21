package com.class35_Exeptions;

import java.util.ArrayList;
import java.util.List;

public class ExeptionIntro {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		System.out.println(a/b);
		// whats what happen when you run this cod, object will be created and throw in to you
		//ArithmeticException exeption=new ArithmeticException();
		//throw exeption;
		
		List<Object> fixedData = new ArrayList<>();
		while (true) {
			Object data = new byte[64 * 1024 - 1];
			fixedData.add(data);
		}
		//System.out.println("Code after an error");will get an c error- unreachable code
		
		
		
		
	}

}
