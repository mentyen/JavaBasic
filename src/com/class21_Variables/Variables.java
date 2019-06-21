package com.class21_Variables;

public class Variables {
/*
 * Variables in Java
 * 1.Local-declared and accessed only inside  method,constructor or block
 * CANNOT BE USED WITH ACCESS MODIFIERS OR STATIC
 * 2.Instance - declaring inside the class but outside of method constructor or block,accesible with a class(can be static)
 * 3.Static/Class(global)- declared inside the class but outside method, constructor or block and they use Static keyword
 *  Access modifiers are Public Private Protected Default Static 
 */
	
		
	public static void main(String[] args) {
		String name="John";
		System.out.println(name);
		
		Variables obj=new Variables();
		obj.hello(name);
		
		
	}
	
	public void hello(String name){
		name="Jack";
		System.out.println("Hello "+name);
		
	}
	
}
