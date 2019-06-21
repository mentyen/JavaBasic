package com.class22_Constructors;

public class StaticVsNonStatic {
	public  String name="John";
	public static String lastName="Snow";
	
	
	public static void main(String[] args) {
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getInfo();
		getInfo1();// with a same class you can call it by method name
		System.out.println(lastName);
		
	}
	//non static can access instance and static variables
	public void getInfo() {
		System.out.println("My name is "+name+ " and my last name is "+lastName);
	}
	//static method can have an access only to static variables but NOT INSTANCE
	public static void getInfo1() {
		//System.out.println("My name is "+name+ " and my last name is "+lastNAme);
		// name has to be STATIC
		System.out.println("I am a static method");
	}

}
