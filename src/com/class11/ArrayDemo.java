package com.class11;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] numbers=new int[4];
		numbers[0]=1;
		numbers[1]=15;
		numbers[2]=5;
		numbers[3]=10;
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]+=2;
		}
		
		System.out.println(numbers[0]);
	}}
