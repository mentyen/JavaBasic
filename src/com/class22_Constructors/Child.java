package com.class22_Constructors;

public class Child extends Parent {
	
	String hairType="Curly";
	
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println("Child 1 eye color "+obj.eyeColor);
		System.out.println("Child 1 heir color "+obj.hairColor);
		System.out.println("Child 1 nose "+obj.nose);
		obj.sing();
		obj.playTennis();
		
		Parent parentObj=new Parent();
		// is not accessible in Parent class --> parentObj.hairType;
		//can not access the behaver as well--> parentObj.playTennis();		
	}
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}
	

}
