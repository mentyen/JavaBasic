package com.class5;

public class LogicalOr {
public static void main(String[] args) {
	
	
	int day=4;
			
	
	if(day==1||day==2||day==3||day==4||day==5) {
		System.out.println("Weekday");
	}
	else if(day==6 || day==7) {
		System.out.println("Weekend");
	}
	else {
		System.out.println("Not a valid day");
	}
}
}
