package com.class20_AccessModifiers;

public class TestAccessModifiers {
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.palindrome("madam");//public
		obj.list("hello");//protected
		obj.sayHello();//default
		//obj.array("murzic");//private is not accessible
		
		System.out.println(obj.name1);//default 
		System.out.println(obj.name2);//protected
		System.out.println(obj.name3);//public
	}

}
