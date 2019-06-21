package com.class12;

public class Homework {

	public static void main(String[] args) {
	int[][] ar= {
			{1,2,3},
			{4,5,6,9},
			{7,8}
	};
	
	for(int i=0;i<ar.length;i++) {
		for(int b=0;b<ar[i].length;b++) {
		System.out.print(ar[i][b]+" ");
		}
		System.out.println();
	}
	for(int[]loop:ar) {
		for(int loop2:loop) {
		System.out.print(loop2+" ");
		}
		System.out.println();
	}
		for(int []loop:ar)System.out.println(loop.length);
		
	}
}