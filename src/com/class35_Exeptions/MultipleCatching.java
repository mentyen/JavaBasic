package com.class35_Exeptions;

public class MultipleCatching {
	public static void main(String[] args) throws InterruptedException {
		
		try {
			Thread.sleep(2000);// new InterruptedException(); will get created and second CATCH will executed
			System.out.println(10/0);// new ArithmeticException(); will execute a first catch
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException catch");
		     //3 ways to print name and details of an exception
		//	   e.printStackTrace();//Name of the E,Details and location
	    //    System.out.println(e);// name and details	
			   System.out.println(e.getMessage());
		}
		catch(InterruptedException e) {
			System.out.println("InterruptedException catch");
		}
		
		System.out.println("End of the code");
	}

}
