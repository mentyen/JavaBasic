package com.class5;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println("Enter your hight in inch:");
	    double h=input.nextDouble();
	            
	    if(h<5) {
	        System.out.println("short");
	    }
	    else if(h>=5 || h<6) {
	        System.out.println("medium");
	    }
	    else if(h>=6) {
	        System.out.println("tall");
	    }

	}

}
