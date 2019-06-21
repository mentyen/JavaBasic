package com.class29_Encapsulation;

public class Student {
	private String name;
	private int age;
    private String id;
	
	public String setId(String id) {
		this.id=id;
		return id;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		if (!name.isEmpty()) {
		this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18) {
		this.age = age;
		}
	}
}
