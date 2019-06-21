package com.class20_AccessModifiers;

public class Student {
	
	
	char getGrade(int a) {
		char grade = 0;
		if (a>90) {
			grade='A';
		}
		if (a>80) {
			grade='B';
		}
		else grade='C';
		
		return grade;
	}
	 
	
	
	
	public static void main(String[] args) {
		Student obj=new Student();
		char result=obj.getGrade(95);
		System.out.println(result);
	
			
		
	}
	  

}
