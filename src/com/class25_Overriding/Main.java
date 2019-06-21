package com.class25_Overriding;

public class Main{
	static void print() {
		System.out.println("Private");
	}
	public static void main(String[] args) {
	
	
	}
}
class S extends Main{
	static void print() {
		System.out.println("Private Child");
	}
	private static void print(String a) {
		System.out.println("Boo");
	}
	public static void main(String[] args) {
		
	}
}
	