package com.class26_THIS;

public class Bank {
	public void getBalance() {
	
	}
	public static void main(String[] args) {
		Bank obj;
		obj=new BankA();
		obj.getBalance();
		obj=new BankB();
		obj.getBalance();
		obj=new BankC();
		obj.getBalance();
	}

}
class BankA extends Bank{
	public void getBalance() {
		System.out.println("Balance is 1000");
	}
}
class BankB extends Bank{
	public void getBalance() {
		System.out.println("Balance is 1500");
	}
}
class BankC extends Bank{
	public void getBalance() {
		System.out.println("Balance is 2000");
	}
}