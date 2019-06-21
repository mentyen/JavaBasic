package com.class27_Abstract;

public abstract class Phone {//abstract class
	
	public void call() {
		System.out.println("Phone can make a phone calls");
	}
	public void send_text() {
		System.out.println("Phone can text");
	}
	
	public abstract void unlockPhone();//were is no implementation of the behaver
	public abstract void viewPictures();//were is no implementation of the behaver

}

class Iphone extends Phone{//concrete class-class inherited from the abstract class
	//or implemented by interface and providing implementation of all unimplemented methods/classes

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Iphone Face ID or FingerPrint");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on Iphone go to Images");
		
	}
	
}
 class Samsung extends Phone{//concrete class

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Sams enter password");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures you have to go to the gallery");
		
	}
	
}
