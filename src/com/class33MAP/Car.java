package com.class33MAP;

import java.util.HashMap;
import java.util.Map;

public class Car {
	private String model;
	private String make;
	
	public Car(String make,String model) {
		this.model=model;
		this.make=make;
	}
	
	public void carDetails() {
		System.out.println(make+" making a new model "+model);
	}
	
	public static void main(String[] args) {
		
		
		Map<Integer,Car> Garage=new HashMap();
		
		Garage.put(1,new Car("Audi","A4"));
		Garage.put(2,new Car("BMW","M4"));
		Garage.put(3,new Car("Tesla","S"));
		Garage.put(4,new Car("VW","Golf"));
		
		for(Car value:Garage.values()) {
		   value.carDetails();
		}
		
		
		
	}

}
