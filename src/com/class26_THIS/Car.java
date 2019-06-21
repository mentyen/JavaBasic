package com.class26_THIS;

public class Car {
	public void drive() {
		System.out.println("Car drives");
	}
	public void drive(int speed) {
		System.out.println("Car drives with speed: "+speed);
	}
	

}
class BMW extends Car{
	public void drive() {
		System.out.println("BMW car drives fast");
	}
	
	}
class Moskvish extends Car{
	public void drive() {
		System.out.println("Moskvich Car impossible to  drives");
	}
}