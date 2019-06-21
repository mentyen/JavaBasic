package com.class27_Abstract;

public abstract class Veichle {
	static int veichle_Count;
	Veichle(){
		veichle_Count++;
	}
	
	public static void total_Veichals() {
		System.out.println("Total veichal ve build = "+veichle_Count);
	}
	//public static abstract void gps(); can not have abstract static because can not be override;
	//private abstract void speed(); can not be private;
	
	
    public abstract void start();
	public abstract void drive();
	
	public void stop() {
		System.out.println("Stop veichle by pressing brakes");
	}

}
abstract class Car extends Veichle{
	/*
	 * Default constructor;
	 * Default super();
	 */
	
	public String make;
	Car(String make){
		this.make=make;
	}
}
class BMW extends Car{
	
	BMW(String make) {
		super(make);
		
	}

	/*
	 * Default constructor;
	 * Default super();executes immediate parent constructor
	 */

	@Override
	public void start() {
		System.out.println("BMW car starts remote");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives and handles greate");
		
	}
	
}
class Toyota extends Car{

	Toyota(String make) {
		super(make);
	
	}

	@Override
	public void start() {
		System.out.println("Toyota starts with a PUSH BUTTON");
		
	}

	@Override
	public void drive() {
		System.out.println("Toyota drives safe");
		
	}
	
}