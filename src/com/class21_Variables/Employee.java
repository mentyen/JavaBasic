package com.class21_Variables;

public class Employee {
	int salary;
	int eID;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.salary=100;
		obj1.eID=234654;
		obj1.print();
		
		Employee obj2=new Employee();
		obj2.salary=100;
		obj2.eID=2346544;
		obj2.print();
		
	}
	
	public void  print() {
		System.out.println(eID+ " of the Employee and his salary is "+salary+" and CEO name is "+CEO);
		
	}

}
