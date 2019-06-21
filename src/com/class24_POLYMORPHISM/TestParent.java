package com.class24_POLYMORPHISM;

public class TestParent {
	public static void main(String[] args) {
		
		double d=12;
		
		Parent parent=new Parent();
		parent.love();
		parent.work();
		Child_test child=new Child_test();
		//child.love();
		//child.cry();
		//child.work();
		//Smaller object can be throw in to the Larger box as parent
		//Parent obj=new Child_test();//type Casting
		//Child obj1=new Parent();
		//obj.work();
		//obj.love();
	
	}

}
