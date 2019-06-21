package com.class16Object;

public class Test {
	String eyes;
	String hair;
	String nose;
	String shirt;
	
	void humanEyes() {
		Test p2=new Test();
		p2.eyes="blue";
		System.out.println(p2.eyes);
	}
	
	public static void main(String[] args) {
		
	Test p=new Test();
	p.eyes="Blue";
	p.hair="Blonde";
	p.nose="brown";
	p.shirt="gray";
	
	p.humanEyes();
		
		
	}

}
