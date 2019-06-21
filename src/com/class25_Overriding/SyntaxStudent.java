package com.class25_Overriding;

public class SyntaxStudent extends Student {
	public void study() {
		System.out.println("Syntax Students must study hard");
	}
	protected void doHomework() {
		System.out.println("Syntax Students must do repl.it");
	}
	void attendClass() {
		System.out.println("Syntax Students must attend all classes and take notes");
	}
	//do not pracisipating in inheritance due to access modifier private
	private void doResearch() {
		System.out.println("Syntax Student must have Google as best friend");
	}

}
