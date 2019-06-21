package com.class8;

public class Loop {

	public static void main(String[] args) {
		// loop
		boolean morning = true;
		if (morning) {
			System.out.println("Good morning");
		}
		while (morning) {
			System.out.println("Good morning");
			break;
		}

		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

		int b = 0;
		while (b < 5) {
			System.out.print("Inside the loop " + b + "\t");
			b++;
		}

		System.out.println("Otside the loop");
		int z = 1;
		while (z <= 20) {
			System.out.print(z + " ");
			z++;
		}
		System.out.println();
		int loop=10;
		while(loop>0) {
			System.out.print(loop+" ");
			loop--;
		}
		
	

	}
}
