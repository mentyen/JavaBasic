package com.class32_Set;

public abstract class CreditCard {
	public String creditCardName;

	public CreditCard(String creditCardName) {
		
		this.creditCardName = creditCardName;
	}
	public void openAccount() {
		System.out.println("Open "+creditCardName+" credit card");
	}
	public abstract void interestRate();
	public abstract void annualFee();

}
class MasterCard extends CreditCard{

	public MasterCard(String creditCardName) {
		super(creditCardName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName +" has interest rates of 20%");
		
	}

	@Override
	public void annualFee() {
		// TODO Auto-generated method stub
		System.out.println(creditCardName+ " has 120$ annual fee");
	}
	
}
class Visa extends CreditCard{

	public Visa(String creditCardName) {
		super(creditCardName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName +" has interest rates of 24%");
		
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+ " has 0$ annual fee");
		
	}
	
}
class Amex extends CreditCard{

	public Amex(String creditCardName) {
		super(creditCardName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName +" has interest rates of 14%");
		
	}

	@Override
	public void annualFee() {
		// TODO Auto-generated method stub
		System.out.println(creditCardName+ " has 170$ annual fee");
	}
	
}