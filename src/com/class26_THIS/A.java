package com.class26_THIS;

public class A {
	public final void call() {
		System.out.println("I am a final");
		
		}
	public final void call(int a) {
		System.out.println("I am a final "+a);
		
		}

}
class B extends A{
	/*
	public final void call() {
		System.out.println("I am a final");
		
		}
		*/
}