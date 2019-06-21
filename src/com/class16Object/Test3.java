package com.class16Object;

public class Test3 {
	String a="hello world my name Is wEqas";
	void vowels() {
		System.out.println(a.replaceAll("[^a,e,i,o,u,A,E,I,O,U]",""));
	}
	
	public static void main(String[] args) {
		Test3 c=new Test3();
		c.vowels();
	}

}
