package com.class24_POLYMORPHISM;

public class Degree {
	public  void getDegree() {
		System.out.println("I got a degree");
	}
	

}
class UnderGraduate extends Degree{
	public   void getDegree() {
		System.out.println("I  am an Undergraduate");
	}
	
}
class Postgraduate extends Degree{
	public  void getDegree() {
		System.out.println("I am a Postgraduate");
	}
	
}

