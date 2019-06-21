package com.class14_StringManipulation;

public class SecondLargest {
	public static void main(String[] args) {
		int []arr= {-99,1200,23,-4,99,450,33};
		int min=0;
		int max=0;
		int secMax=0;
		
		for(int a:arr) {
			if(a>max) {
				secMax=max;
				max=a;
			}
			if(a>secMax&&a<max)secMax=a;
			if(a<min)min=a;
		}
		System.out.println(secMax);
		System.out.println(min);
	}

}
