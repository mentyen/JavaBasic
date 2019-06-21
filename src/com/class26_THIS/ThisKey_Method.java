package com.class26_THIS;

public class ThisKey_Method {
	int num1,num2;
	
	public ThisKey_Method() {
		System.out.println("No parameter method");
	}

	public ThisKey_Method(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;

}
	//What would be the behavior if this() in a method?//It would call current class instance method



	public void sum(int num1,int num2) {
		System.out.println("Summ of the local variables is "+ (num1+num2));
		System.out.println("Summ of instance variables is "+(this.num1+this.num2));
	}
	public static void main(String[] args) {
		ThisKey_Method obj=new ThisKey_Method(10,20);
		obj.sum(100,200);
		
		System.out.println("____________-----------____________");
		
		ThisKey_Method obj1=new ThisKey_Method();
		obj1.sum(12, 13);
	}
	
	
}