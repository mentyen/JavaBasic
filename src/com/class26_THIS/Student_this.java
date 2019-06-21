package com.class26_THIS;

public class Student_this {
	String fullName;
	int age;
	
	public Student_this(String fullName,int age) {
		this.fullName=fullName;
		this.age=age;
		
	}
	
	public void dsplayDetails() {
		System.out.println("Student full name is  "+fullName+ " and age "+age);
	}
	public static void main(String[] args) {
		Student_this obj=new Student_this("John Smith",25);
		obj.dsplayDetails();
	}

}
