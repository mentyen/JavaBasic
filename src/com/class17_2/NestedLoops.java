package com.class17_2;

public class NestedLoops {
	void count() {
		for (int i=0; i<5; i++) {
			for (int y=0; y<3; y++) {
				System.out.println("I am inner loop"+y);
				}
			System.out.println("-------I am outer loop------"+i);
			}
		
	}
	public static void main (String[] args) {
		NestedLoops a=new NestedLoops();
		a.count();
		}

}
