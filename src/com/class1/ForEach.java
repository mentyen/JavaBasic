package com.class1;

public class ForEach {
	public static void main(String[] args) {
		
	
	/*
	 * 
	 * for(initialization:massive/collection)
	 *body;
	 *  
	 */
	/*int[] mas=new int[10];
	
	for(int i=0;i<mas.length;i++) {
		mas[i]=i;
		System.out.print(mas[i]+" ");
	}
	System.out.println();
	
	for(int value:mas) {
		System.out.print(value+" ");
	}
	*/
	int[][] mas1=new int[10][8];
	for(int i=0;i<mas1.length;i++) {
		for(int j=0;j<mas1[i].length;j++) {
			mas1[i][j]=i+j;
		}
	}
	for(int []m:mas1) {
		for(int mm:m) {
			System.out.print(mm+"\t");
		}
		System.out.println();
	}

}}
