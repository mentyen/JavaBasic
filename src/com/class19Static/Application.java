package com.class19Static;

public class Application {
	public static void main(String[] args) {
		
		Human person1=new Human();
	
		System.out.println(person1.eyeColor);//brown
	
		
		person1.eyeColor="Pink";// value of eyeColor will be pink from now on
		System.out.println(person1.eyeColor);//pink
		
		person1.color();//pink as well
		
		Human person2=new Human();
		person2.eyeColor="Orange";//value of eyeColor will be Orange from now on
		
		System.out.println(person2.eyeColor);//Orange
		
		//Static(Class) variables and instance variables both are member variables because they are both associated with a specific class, but the difference between them is Class variables only have one copy that is shared by all the different objects of a class, whereas every object has it's own personal copy of an instance .
		
		
	}

}
