package com.class26_THIS;

public class Super__Constructor {
	
	public Super__Constructor() {
		
		System.out.println("I am a parent class constructor");
	}
	public Super__Constructor(String a) {
		this();
		System.out.println("I am a parent class constructor with a parameters "+a);
	}

}
class Child_SuperConstructor extends Super__Constructor{
	

	
	public Child_SuperConstructor() {
		
		System.out.println("I am child class constructor");
	}
	public Child_SuperConstructor(int a) throws CloneNotSupportedException {
		super("Vasya");
		super.clone();
		this.clone();
		System.out.println("I am child class constructor");
	}
	
}