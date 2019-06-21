package com.class24_POLYMORPHISM;

public class Bank {
	public int chargeInterest() {
		return 0;
	}
}

class BOA extends Bank{
	//method overwriting
	public int chargeInterest() {
		return 2;
	}
}
class WellsFargo extends Bank{
	@Override
	public int chargeInterest() {
		return 3;
	}
}
class Chaise extends Bank{
	@Override//annotation
	public int chargeInterest() {
		return 4;
	}
}