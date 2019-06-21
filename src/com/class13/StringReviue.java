package com.class13;

import java.util.Scanner;

public class StringReviue {
	public static void main(String[] args) {
		/*
		String text="Hello world";
		for(int i=text.length()-1;i>=0;i--) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
		if(!(text.isEmpty())) {
			if(text.length()%2!=0&&text.length()>3) {
				
				System.out.println(text.charAt(text.length()/2));
				
			}
		}
		*/
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("Moms first name?");
		String momsName=input.nextLine();
		System.out.println("Dad’s first name?");
		String dadName=input.nextLine();
		System.out.println("Boy or Girl?");
		String jender=input.nextLine();
		
		if(jender.equalsIgnoreCase("boy"))System.out.println(dadName.substring(0,dadName.length()/2)+momsName.substring(momsName.length()/2));
		if(jender.equalsIgnoreCase("girl"))System.out.println(momsName.substring(0, momsName.length()/2)+dadName.substring(dadName.length()/2));

		
		
		switch(jender){
		
		case "girl":
			System.out.println(momsName.substring(0, momsName.length()/2)+dadName.substring(dadName.length()/2));
			break;
		case "boy":
			System.out.println(dadName.substring(0,dadName.length()/2)+momsName.substring(momsName.length()/2));

			break;
		
		
		}
		
	}

}
