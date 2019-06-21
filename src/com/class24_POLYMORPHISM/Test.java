package com.class24_POLYMORPHISM;

public class Test  {
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.getPaid();
		
		FullTimeEmpl obj1=new FullTimeEmpl();
		obj1.getPaid();
		Employee obj2=new FullTimeEmpl();
		obj2.getPaid();
		
	}
	

}
