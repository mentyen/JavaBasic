package com.class22_Constructors;

public class StaticVsNonStatic_Call {
	public static void main(String[] args) {
		StaticVsNonStatic obj=new StaticVsNonStatic();
		System.out.println(obj.name);
		System.out.println(obj.lastName);
		// lastName; will give you an error couse were is no such variables in present class
		
		StaticVsNonStatic.getInfo1();// i can access static members by calling className.methodName
		obj.getInfo();// i can access non static methods
		System.out.println(StaticVsNonStatic.lastName);
	}

}
