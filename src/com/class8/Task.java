package com.class8;

public class Task {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			
			System.out.println("I need a day off "+day);
			day++;
			
			if(day==6) {
				workDay=false;
			}
			
			}
		
		System.out.println("I dont need a day off");
		

	}

}
