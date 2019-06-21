package com.class11;

public class ArrayPiramide {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int b=5;b>0;b--) {
				if(b<=i) {
					System.out.print("* ");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int b=1;b<=(5-i);b++) {
				System.out.print("*");
			}
			System.out.print(i);
			System.out.println();
			}
			
		}
		
	}


