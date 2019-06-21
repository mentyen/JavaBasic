package com.class26_THIS;

public class This_Constructor {
	public This_Constructor() {
		System.out.println("I am inside of the constructor with no parameters");
		System.out.println("I have no parameters");
		
	}
	public This_Constructor(int a) {
		this();
		System.out.println("I am inside of the constructor with 1 parameters");
		System.out.println("I have one int parameter "+a);
	}
	public This_Constructor(int a,int b) {
		this(a);
		System.out.println("I have tho int parameters "+a+" "+b);
	}
public static void main(String[] args) {
	//This_Constructor obj=new This_Constructor();
	//This_Constructor obj1=new This_Constructor(2);
	This_Constructor obj2=new This_Constructor(9,3);
}
}
