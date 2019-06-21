package com.class22_Constructors;

public class Test1 {
	public Test1(){
		System.out.println("I am a constructor");
	}
	public Test1(String name) {
		System.out.println("i am a constractor with a name "+name);
	}
public static void main(String[] args) {
	Test1 obj=new Test1();
	Test1 obj1=new Test1("Murzik");
}
}
