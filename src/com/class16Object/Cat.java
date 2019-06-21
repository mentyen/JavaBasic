package com.class16Object;

import java.util.Scanner;

public class Cat {
	String name;
	
	void boom(){
	System.out.println("I do not have a return type");
	}
	void scannerFirstName() {
		Scanner input=new Scanner(System.in);
		Cat boss=new Cat();
		System.out.println("Enter a cat name");
		boss.name=input.nextLine();
		System.out.println(boss.name);
		
	}
	void scannerInt() {
		Scanner input=new Scanner(System.in);
		input.nextInt();
	}
	
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.boom();
		cat.scannerFirstName();
		cat.scannerInt();
		
	}

}
