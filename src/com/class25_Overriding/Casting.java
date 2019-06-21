package com.class25_Overriding;

public class Casting {
	public static void main(String[] args) {
		//Implicit/Automatic/Widening--compiler takes care of the conversion
		double a=10;
		System.out.println(a);
		double b=10.0;
		//Explicit/Manual only/Narrowing--programmer takes care of the conversion
		int c=(int)b;
		System.out.println(c);
		
		int i=130;
		byte d=(byte)i;
		System.out.println(d);//-126 so you will responsible if you will do it
		//UpCasting //automatic/ obj of the smaller class goes in to the Parent Class
		Payment pay=new MasterCard();
		
		//MasterCard mc=new Payment(); YOU WANT BE ABLE TO DO OPPOSITE
		
		//DownCasting//manual on your own risk
		MasterCard mc=(MasterCard)new Payment();
		
		
	}

}
