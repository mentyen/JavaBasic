package com.class35_Exeptions;

public class ExceptionHandeling {
	public static void main(String[] args) {
		System.out.println("Begining of the code");
		
		try {
		Thread.sleep(2000);//object of an exception may be thrown(new InterruptedException);
		}
		//InterruptedException e=new InterruptedException();we will store the exception in variable e and now it get all object methods.
		//it can be store in parent or child class of the exception.
		//Object has to be MAtCHING with a class exception
		catch(InterruptedException e) {
			System.out.println("I am a catch block");
			e.getMessage();
		}
		System.out.println("The end of the code");
		
	}

}
