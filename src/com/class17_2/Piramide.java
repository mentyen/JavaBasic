package com.class17_2;

public class Piramide {
	
	void result() {
		for(int i=0;i<5;i++) {
			for(int c=5;c>i;c--) {
				System.out.print("+");
			}
			System.out.print("  ");
			for(int b=0;b<=i;b++) {
				System.out.print("* ");
			}
			System.out.print(" ");
			for(int c=5;c>i;c--) {
				System.out.print("+");
			}
			
			System.out.println( );
			}
		
	}
	public static void main(String[] args) {
		
		Piramide a=new Piramide();
		a.result();
             
		}
		
	}


