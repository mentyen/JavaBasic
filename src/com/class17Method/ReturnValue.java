package com.class17Method;

public class ReturnValue {
	
	void hello(String name) {
		System.out.println("Hello "+name);
	}
	
	 String whatIsADay() {
		return "Thursday";
	}
	 
	 int result(int a,int b) {//parameters
			if(a>b)return a;
			else return b;
			}
	 void compare(int i) {
			if(i%2==0)System.out.println("The number is EVEN");
			else System.out.println("The number is ODD");
		}
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.length());
		char character=str.charAt(3);
		System.out.println(character);
		
		ReturnValue obj=new ReturnValue();
		obj.hello("Mo");
		
		String day=obj.whatIsADay();
		System.out.println(day);
		
		int x=obj.result(23, 15);//arguments
		obj.compare(x);
		System.out.println(x);
	}

}
