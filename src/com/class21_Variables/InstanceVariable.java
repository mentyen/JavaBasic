package com.class21_Variables;

public class InstanceVariable {
	String name="John";
	public static void main(String[] args) {
		
		String name="Anna";
		System.out.println(name);
		//changing a local variable
		name="Olga";
		System.out.println(name);
		
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.name);
		obj.name="Kolya";//changing a instance variable for obj
		
		InstanceVariable obj1=new InstanceVariable();
		System.out.println(obj1.name);
		
	}
	
	public void hello() {
		System.out.println(name);
	}

}
