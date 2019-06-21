package com.class19Static;

public class AnimalsApp {
	
//modifier    modifier   return type   name          parameters  
	public    static        void        main       (String[] args) {
	//class    object/variable	      alocate a memory
		Animals     dog            =     new             Animals();
		System.out.println(dog.age);
		System.out.println(dog.breed);
		System.out.println(dog.name);
		System.out.println(dog.weight);
		System.out.println(dog.isWild());
		System.out.println(dog.canBark());
	     dog.name="muska";//will change the name for the rest cause its static
	     dog.age=40;//will not change to the rest of the objects
		
		Animals cat=new Animals();
		System.out.println(cat.age);
		System.out.println(cat.breed);
		System.out.println(cat.name);
		System.out.println(cat.weight);
		System.out.println(cat.isWild());
		System.out.println(cat.canBark());
		
		Animals fox=new Animals();
		System.out.println(fox.age);
		System.out.println(fox.breed);
		System.out.println(fox.name);
		System.out.println(fox.weight);
		System.out.println(fox.isWild());
		System.out.println(fox.canBark());
		
		
		
		
	}

}
