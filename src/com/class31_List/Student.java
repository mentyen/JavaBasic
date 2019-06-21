package com.class31_List;

public class Student {
	public String name;
	public int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(name + " " + age);
	}
}
