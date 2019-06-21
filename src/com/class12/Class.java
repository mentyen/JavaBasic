package com.class12;

public class Class {
	
	
	
	public static void main(String[] args) {
		int[][] bar=new int[5][];
		for(int i=0;i<bar.length;i++) {
			bar[i]=new int[i+=3];
			for(int b=0;b<bar[i].length;i++) {
				bar[i][b]=2;
				System.out.print(bar[i][b]);
			}
			System.out.println();
		}
		
		
	}

}
