package com.class28_INTERFACE;

public interface TakeScreenshot {

	String fileExtension = ".png";// public static final by default and MUST BE initialized;

	void TakeScreenshot();

	static void m1() {
		System.out.println("Static void m1");

	}

	default void m2() {
		System.out.println("Static void m2");

	}
}
