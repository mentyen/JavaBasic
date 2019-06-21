package com.class24_POLYMORPHISM;

public class BankTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		Bank boa=new BOA();
		Bank chaise=new Chaise();
		
		System.out.println(bank.chargeInterest());
		System.out.println(boa.chargeInterest());
		System.out.println(chaise.chargeInterest());
	}

}
