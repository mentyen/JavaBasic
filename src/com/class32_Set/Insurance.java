package com.class32_Set;

public abstract class Insurance {
	public String insuranceName;
	
	public Insurance(String insuranceName) {
	
		this.insuranceName = insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
class Car extends Insurance{
	public String carModel;

	public Car(String insuranceName,String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" for "+carModel+"  gives you rate of 120 per month");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println( insuranceName+" with a free cancelation policy");
		
	}
	
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println("Health insurance "+ insuranceName+" gives you rate of 440$ per month");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println( insuranceName+" with a free cancelation policy");
		
	}
	
}
class Pet extends Insurance{
	public String petType;

	public Pet(String insuranceName,String petType) {
		super(insuranceName);
		this.petType=petType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" gives you rate of 35$ per month");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println( insuranceName+" with a free cancelation policy");
		
	}
	
}