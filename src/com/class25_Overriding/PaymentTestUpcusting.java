package com.class25_Overriding;

public class PaymentTestUpcusting {
	public static void main(String[] args) {
		Payment parent=new Payment();
		parent.makePayment();
		
		MasterCard mc=new MasterCard();
		mc.makePayment();
		
		Visa v=new Visa();
		v.makePayment();
		v.annualFee();
		//achieving run time polymorphism
		
		//pay its our refference variable were Payment is our type
		//new MasterCard were we creating a object
		Payment pay=new MasterCard();
		
		//JDM will always execute overriding method from a child
		pay.closePayment();//get it from a parent class
		pay.makePayment();//get it from a child class
		
		
		//we will have access to all methods in parent class, 
		// compiler will execute overriding methods in child class first
		//you will not be able to execute the child class methods
		
		//UPCASTING and ADCHIEVING RUN time POLYMORPHISM
		//Compiler will give you access to the parent methods
		//JVM before execution will check for overriding methods in a child class and execute them
		Payment pay1=new Visa();
		pay1.closePayment();
		pay1.makePayment();
		//pay1.annualFee();---The method annualFee() is undefined for the type Payment
		
		
		
	}

}
