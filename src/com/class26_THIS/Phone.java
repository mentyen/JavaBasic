package com.class26_THIS;

public class Phone {
	
	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	public void hasCamera() {
		System.out.println("Phone has a camera");
	}


}

class Iphone extends Phone{
	public void makeCall() {
		System.out.println("Iphone can do FaceTime");
		
	}
	public void hasCamera() {
		System.out.println("Iphone has a full HD camera");
	}

}
class Samsung extends Phone{
	public void hasCamera() {
		System.out.println("Samsung has 3 lenses camera");
	}
	
}

class Nokia extends Phone{
	public void cannotBrake() {
		System.out.println("Nokia phone is unbreakeble");
	}
	
}