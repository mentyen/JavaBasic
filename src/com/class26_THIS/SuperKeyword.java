package com.class26_THIS;

public class SuperKeyword {
	 String name="Jo";
	 
	public void printName() {
		System.out.println("My name is : "+name);
	}

}
class ChildSuper extends SuperKeyword{
	String name="Mike";
	public void printName() {
		System.out.println("Parent name is:"+super.name);
		System.out.println("My name is : "+name);
	}
	
	public void callingMethods() {
		printName();
		super.printName();
	}
}