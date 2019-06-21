package com.class22_Constructors;

public class Child2 extends Parent{

	String skinColor="Black";
	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.sing();
		obj.playMusic();
		System.out.println("Child 2 eye color "+obj.eyeColor);
		System.out.println("Child 2 heir color "+obj.hairColor);
		System.out.println("Child 2 nose "+obj.nose);
		System.out.println("Child 2 skin color "+obj.skinColor);
		
		// not able to get access to Child 1 method-->obj.playTennis();
	
	
	}
	public void playMusic() {
		System.out.println("Child 2 can play music");
	}

}
