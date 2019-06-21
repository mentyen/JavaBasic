package com.class19Static;

public class MinAndMax {
	
	static int min(int[]array) {
		int a=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<a) {
				a=array[i];
			}
		}
		return a;
	}
	static int max(int[]array1) {
		int a=array1[0];
		for(int i=0;i<array1.length;i++) {
			if(array1[i]>a) {
				a=array1[i];
			}
		}
		return a;
		
		
	}

}
