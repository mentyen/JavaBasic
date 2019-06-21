package com.class15;

public class Class {
	
	static void startCar(panas x) {
		x.stop();
		x.drive();
		x.start();
		System.out.println(x.capacity);
		System.out.println(x.color);
	}
	
		public static void main(String[] args) {
			panas tv=new panas();
			
			startCar(tv);
			panas tv1=new panas();
			tv1.capacity=7;
			tv1.color="black";
			tv1.name="LG";
			startCar(tv1);
			
		}
	}


