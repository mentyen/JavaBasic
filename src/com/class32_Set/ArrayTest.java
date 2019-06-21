package com.class32_Set;

public class ArrayTest {
	public static void main(String[] args) {
		int[]intArray= {1,2,3};
		
		String a="A";
		String b="B";
		String[]strArray= {"a","b","c"};
		
		Visa visa1=new Visa("Visa Test");
		Visa visa2=new Visa("Visa Test");
		Visa visa3=new Visa("Visa Test");
		
		Amex ax1=new Amex("Visa Test");
		Amex ax2=new Amex("Visa Test");
		Amex ax3=new Amex("Visa Test");
		
		
		CreditCard[]visaArray= {visa1,visa2,visa3,ax1,ax2,ax3};
		Object[]objArray= {visa1,ax1,a,b};
	}

}
