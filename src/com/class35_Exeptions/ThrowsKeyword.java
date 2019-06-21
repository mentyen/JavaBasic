package com.class35_Exeptions;

public class ThrowsKeyword {
	static String name;
	
	
	static void sleep() throws InterruptedException {
		System.out.println("Student "+name+ " is sleeping");
		Thread.sleep(1000);
		System.out.println("He need better food and clean of his body");
	}
	public static void allStudentsSleeping() throws InterruptedException,ArithmeticException {
		sleep();
	}
	public static void sleepMode(){
		try {
			allStudentsSleeping();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
	     sleepMode();
	     
	     
	   
	}

}
