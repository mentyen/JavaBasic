package com.class21_Variables;

public class Car {
	public String color;
	public static int totalCars;
	
public static void main(String[] args) {
	Car car1=new Car();
	car1.color="white";
	totalCars++;
	Car car2=new Car();
	car2.color="black";
	totalCars++;
	System.out.println("Total car we made is "+totalCars);
	
	
}
}
