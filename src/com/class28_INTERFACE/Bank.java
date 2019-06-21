package com.class28_INTERFACE;

public interface Bank {
	
	static String name="Bank";//by default all variables are public static final;CONSTANT VARIABLES
	//CAN NOT HAVE instance variables.
	//CAN NOT HAVE static methods as abstract.
	//CAN NOT HAVE constructors---no body no object no instance variables to initialize;
	
	String hello="Hello";
	
	//by default adds public and abstract to every method
	void has_Checking();
	void has_Savings();
	void has_CreditCard();
	
	//static void loan();----can not have static method 

}
class BOA implements Bank{

	@Override
	public void has_Checking() {
		System.out.println("BoA has 2 checking account");
		
	}

	@Override
	public void has_Savings() {
		System.out.println("BoA has 2 saving account");
		
	}

	@Override
	public void has_CreditCard() {
		System.out.println("BoA has 10 type of credit cards");
		
	}
	
}
class Chase implements Bank{

	@Override
	public void has_Checking() {
	System.out.println("Chase has 2 checking accounts");
		
	}

	@Override
	public void has_Savings() {
		System.out.println("Chase has 3 saving accounts");
		
	}

	@Override
	public void has_CreditCard() {
		System.out.println("Chase has 5 credit cards variations");
		
	}
	
}
