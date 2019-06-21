package com.class16Object;

public class Car {

	// Attributes
	String make, model, color;
	int door, wheels;

	// Behaver(methods);
	void drive() {
		System.out.println("Car can drive");
	}

	void reverce() {
		System.out.println("Car can reverce");
	}

	void stop() {
		System.out.println("Car can stop");
	}

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "Black";
		car1.door = 4;
		car1.wheels = 4;
		car1.drive();
		car1.reverce();
		car1.stop();

		Car car2 = new Car();
		car2.make = "Tesla";
		car2.model = "x";
		car2.color = "blue";
		car2.door = 4;
		car2.wheels = 4;
		car2.drive();
		car2.reverce();
		car2.stop();

		System.out.println("Car " + car1.make + " has " + car1.wheels + " wheels");
		System.out.println("My car is " + car2.color + " " + car2.make);
	}

}
