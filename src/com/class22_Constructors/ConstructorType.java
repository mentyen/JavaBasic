package com.class22_Constructors;

public class ConstructorType {
	
	ConstructorType(){
		System.out.println("I am costructor without parameters");
	}
	
	ConstructorType(String str){
		System.out.println("I am a constructor with 1 parameter "+str);
	}
	ConstructorType(int a,String str){
		System.out.println("I am a constructor with 2 parameters "+a+" "+str);
	}
	
public static void main(String[] args) {
	ConstructorType obj=new ConstructorType();
	ConstructorType obj1=new ConstructorType("Name");
	ConstructorType obj2=new ConstructorType(11,"Name");
}
}
