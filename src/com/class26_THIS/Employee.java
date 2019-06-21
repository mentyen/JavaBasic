package com.class26_THIS;

public class Employee {
	String name, lastName;

	Employee() {
		System.out.println("I am a parent class Constructor");
	}

	public Employee(String name, String lastName) {
		
		this.name = name;
		this.lastName = lastName;
	}
}

class Tester extends Employee {
	int salary;

	 Tester(String name,String lastName,int salary) {
		 super(name,lastName);
		this.salary = salary;
	}
	public void displayInfo() {
		System.out.println("Employee "+name+" "+lastName+" has salary is "+salary);
	}

}