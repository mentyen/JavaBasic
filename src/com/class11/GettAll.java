package com.class11;

public class GettAll {
	public static void main(String[] args) {
		String[] names= {"a","b","c","d","g","f","t"};
		int a=3;
		System.out.println(names[a]);
		a+=2;
		System.out.println(names[a]);
		a-=4;
		System.out.println(names[a]);
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(Object i:names) {
			System.out.println(i);
		}
		
		char[]grades= {'q','w','e'};
		for(int i=0;i<grades.length;i++)System.out.println(grades[i]);
		
		
	}

}
