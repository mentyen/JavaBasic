package com.class10;

public class NestedLoop {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			for(int y=2;y<=10;y++) {
				
				System.out.print(y*i +" ");
			}
			System.out.println();
		}
	}

}
