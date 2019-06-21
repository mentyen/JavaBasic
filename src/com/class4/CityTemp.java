package com.class4;

import java.util.Scanner;

public class CityTemp {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	
	System.out.println("Please enter your City:");
	String city = input.nextLine();
	System.out.println("Please enter your t:");
	int tempf =input.nextInt();
	int tempc = (tempf-32) * 5/9; 
	
	System.out.printf("The temperature inn city of %s is the %d fahrenheit or %d celcius.",city,tempf,tempc);
	input.close();
	
	
}

}
