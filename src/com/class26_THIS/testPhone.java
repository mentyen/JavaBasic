package com.class26_THIS;

public class testPhone {
public static void main(String[] args) {
	//Parent class Object
	Phone phone=new Phone();
	phone.makeCall();
	phone.hasCamera();
	System.out.println();
	//Child class Iphone obj
	Iphone iphone=new Iphone();
	iphone.makeCall();
	iphone.hasCamera();
	System.out.println();
	//Child class Samsung--obj
	Samsung samsung=new Samsung();
	samsung.makeCall();
	samsung.hasCamera();
	System.out.println();
	//Nokia class -obj
	Nokia nokia=new Nokia();
	nokia.hasCamera();
	nokia.makeCall();
	
	System.out.println();
	//Run time polymorpfism
	//Object of the iphone refering to the parent
	//JVM during a run time will execute overiden methods in child
	Phone p=new Iphone();
	p.hasCamera();
	p.makeCall();
	System.out.println();
	
	Phone p1=new Nokia();
	p1.makeCall();
	p1.hasCamera();
	System.out.println();
	
	
	Phone parentPhone;
	
	parentPhone=new Iphone();
	parentPhone.hasCamera();
	parentPhone.makeCall();
	System.out.println();
	
	parentPhone=new Samsung();
	parentPhone.hasCamera();
	parentPhone.makeCall();
	System.out.println();
	
	parentPhone=new Nokia();
	parentPhone.hasCamera();
	parentPhone.makeCall();
	
	
}
}
