package com.class21_Variables;

import com.class20_AccessModifiers.AccessModifiers;

public class TestAccessModifiers {
public static void main(String[] args) {
	AccessModifiers obj=new AccessModifiers();
	obj.palindrome("Hey");//accesing a method from another pack public
	System.out.println(obj.name3);//public 
}
}
