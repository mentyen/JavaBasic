package com.class24_POLYMORPHISM;

public class Programming {
	 Programming() {
		System.out.println("I love programming languages");
	}
	 Programming(String a) {
		System.out.println("I love "+a);
	}
	 
	 public static void print() {
		 System.out.println("Hello");
	 }
	 public static void print(String a) {
		 System.out.println("Hello "+ a);
	 }
	 public static void print(String a,String b) {
		 System.out.println("Hello " +a+" "+b);
	 }
	 private static void list() {
		 System.out.println("Hello");
	 }
	 private static void list(String a) {
		 System.out.println("Hello "+ a);
	 }
	 private static void list(String a,String b) {
		 System.out.println("Hello " +a+" "+b);
	 }
	
	
	public static void main(String[] args) {
		Programming a=new Programming();
		Programming b=new Programming("Java");
		Programming.print();
		Programming.print("World");
		Programming.print("World","Java");
		Programming.list();
		Programming.list("World");
		Programming.list("World","Java");
	}
}
