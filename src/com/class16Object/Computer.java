package com.class16Object;

public class Computer {

	boolean mouse, keyboard;
	int ram,screen;
	String os,brand;
	
	void watchMovie() {
		System.out.println("Can watch a movie on this computer "+brand);
	}

	void doJavaCoding() {
		System.out.println("Can do Java coding on this computer "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on this computer "+brand);
	}
	
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.mouse = true;
		com1.keyboard = true;
		com1.screen = 2;
		com1.ram = 8;
		com1.os = "Windows";
		com1.brand="Asus";
		com1.watchMovie();
		com1.doJavaCoding();
		com1.playMusic();

		Computer com2 = new Computer();
		com2.mouse = false;
		com2.keyboard = false;
		com2.screen = 4;
		com2.ram = 6;
		com2.os = "Mac Os";
		com2.brand="Apple";
		

	}

}
