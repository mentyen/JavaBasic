package com.class25_Overriding;

public class Payment {
	//overridden method
	public void makePayment() {
		System.out.println("Parent class:We can make a payment with no fee");
	}
	public void closePayment() {
		System.out.println("Parent class:All payments needs to be closed");
	}
}

class MasterCard extends Payment{
	//overriding method
	public void makePayment() {
		System.out.println("We can make a payment with MasterCard 2% fee");
	}
	
}
class Visa extends Payment{
	//overriding method
	public void makePayment() {
		System.out.println("We can make a payment with Visa 3% fee");
	}
	public void annualFee() {
		System.out.println("Visa card has annual fee ");
	}
}