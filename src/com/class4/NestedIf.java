package com.class4;

public class NestedIf {
public static void main(String[] args) {
	
	/*
	 * if less then 16 not allow 
	 * if more allow to work
	 * if yonger than 64 > go to work
	 * otherwise >enjoy life
	 * 
	 */
	int age = 5;
	int legalage=16;
	
	if(age<legalage) {
		System.out.println("To young");
		
	}else {
		System.out.println("Good to go!");
		if(age<64) {
			System.out.println("Go to work!");
		}
		else {
			System.out.println("Your time is ower!!");
		}
	}
	double gpa =3.8;
	double eGpa=3.7;
	boolean hasDiploma=true;
	if(hasDiploma) {
		System.out.println("Congrads.");
		if(gpa>eGpa) {
			System.out.println("You are hired.");
		}
		else {
			System.out.println("You are not hired.");
		}
		
	}
	else {
		System.out.println("Please get your degree.");
	}
}
}
