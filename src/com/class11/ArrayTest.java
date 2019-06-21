package com.class11;

public class ArrayTest {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int b=1;b<=5;b++) {
				if(b==i) {
					System.out.print(i);
				}
				else System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
