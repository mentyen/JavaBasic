package com.class27_Abstract;

public class Veichle_TEST {
public static void main(String[] args) {
	Car bmw=new BMW("bmw");
	bmw.drive();
	bmw.start();
	bmw.stop();
	
	Car car=new Toyota("toyota");
	car.drive();
	car.start();
	car.stop();
	
	System.out.println(Veichle.veichle_Count);
	
	new Toyota("camry");
	new BMW("x2");
	
	Veichle.total_Veichals();
}
}
