package com.class4;

public class test2 {
	
	private String name;
	private int age;
	
	public test2(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("I am a live!!!");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	
public static void main(String[] args) {

	
	test2 man = new test2("Lola",34);
	
	
	System.out.println(man.name);
	
	
}
}
