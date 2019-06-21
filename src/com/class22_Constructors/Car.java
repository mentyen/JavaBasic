package com.class22_Constructors;

public class Car {
	public static String brand="Toyota";
	String color;
	String model;
	int doors;
	boolean engine;
// block of code that initializes the newly created object and will give default values for all uninitialized instance variables
	//int=0;String=null;boolean=false;
//A constructor doesn’t have a return type.

//The name of the constructor must be the same as the name of the class.

// are not considered members of a class.

//A constructor is called automatically when a new instance of an object is created.
	

	
	private Car(){//by creating an object constructor will be called automaticly
		System.out.println("I am a constructor");
		System.out.println("Hello from constructor");
		
	}
	
	public static void hello() {
		String name;
		//System.out.println(name);
		System.out.println("I am static hello method");
	}
	
//Access modifier //non access modif//no return type//name of the method//Parameters array of arguments 
	public              static         void              main            (String[] args) {
		
		//OBJECT its a instatnce variable of the CLASS
//class name//reference variable or object name//assigning operator//allocating a memory for a new obj//		
		Car                    obj                      =                                 new             Car();
	     hello();
	    System.out.println(obj.color);
	    System.out.println(obj.doors +" "+obj.engine);
	}

}
