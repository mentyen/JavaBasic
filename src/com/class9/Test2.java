package com.class9;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.print("7.");
		for(int i=1;i<30;) {
			System.out.print(i);
			i++;
			Thread.sleep(100);
		}
	}

}
