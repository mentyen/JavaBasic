package com.class9;

public class BreakTask {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		for (int g = 0; g <= 4;g++) {
			System.out.println("Hello");
			break;
		}

		////////////////////////////////////////////

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		int s = 0;
		for (int i = 10; i <= 50; i += 10) {
			s = s + i;
		}
		System.out.println(s);

	}
}
