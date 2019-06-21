package com.class35_Exeptions;

public class ChildToParentException {
	public static void main(String[] args) {
		int[]array= {12,23,45,6};
		try {
			Thread.sleep(2000);
			System.out.println(array[7]);
		} catch (InterruptedException e) {

		} catch (ArithmeticException e) {
			
		} catch (Exception e) {

		}

}}
