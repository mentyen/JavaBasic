package com.class21_Variables;

public class Dog {
	static String breed="Husky";
	static int paws=4;
	String name;
	int weight;
	int height;
	public static void main(String[] args) {
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
				
		dog1.name="Mardy";
		dog1.height=40;
		dog1.weight=100;
		dog1.getDogProperties();
		
		dog2.name="Waffle";
		dog2.height=90;
		dog2.weight=100;
		dog2.getDogProperties();
		
		dog3.name="Lucie";
		dog3.height=20;
		dog3.weight=30;
		dog3.breed="Shitsu";//by object reference
		// Dog.breed="Shitsu" Access by class name
		//breed="Shitsu" 
		dog3.getDogProperties();
	
	
	}
	public void getDogProperties() {
		System.out.println(name+" is a breed of "+breed+" and weight is "+weight+" and its hight is "+height);
	}

}
