package com.class24_POLYMORPHISM;

public class Child_test extends Parent_test {
	
	Child_test(){
		System.out.println("I am a Child constructor");
	}
	
	public static void main(String[] args) {
	//	Parent_test c=new Parent_test();
		//Parent_test d=new Parent_test("Muss");
		
		Child_test child=new Child_test();
		//child.a=123;
		System.out.println(child.a);
		Child_test.instatnceVariable();
		child.pro();
		
		
		
	}

}
