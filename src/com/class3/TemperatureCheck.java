package com.class3;

public class TemperatureCheck {
	public static void main(String[] args) {
		double temp = 32;
		double current = 77.0;
		
		if(current<temp) {
			System.out.println("Water will freeze with temperature "+current);
		}
		else {
			System.out.println("Water will NOT freeze with temperature "+current);
		}
		
	}

}
