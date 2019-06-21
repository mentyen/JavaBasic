package com.class22_Constructors;

public class Test3 {
	
	private static class T{
		
		private T() {
			System.out.println("Private constructor");
		}
		public static void main(String[] args) {
			T obj=new T();
			
		}
	}
	
	public static void main(String[] args) {
		T obj1=new T();
		
	}
	
}
