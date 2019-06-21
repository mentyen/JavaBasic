package com.class23;

public class Dog {
	public String name;
	  static String breed="Mutt";
	  public double weight;
	  
	  Dog(String name,String breed,double weight){
	   
	    System.out.println(name+" "+breed+" "+weight);
	  }
	  Dog(String name,double weight){
		  System.out.println(name+" "+breed+" "+weight);
	  }
	  

}
