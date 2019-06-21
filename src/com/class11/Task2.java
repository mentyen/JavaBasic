package com.class11;

public class Task2 {
	public static void main(String[] args) {
		double discount;
		char code = 'C' ;

		switch ( code )
		{
		case 'A':
		discount = 0.0;
		break;

		case 'B':
		discount = 0.1;
		break;

		case 'C':
		discount = 0.2;
		break;

		default:
		discount = 0.3;
		break;
		}
		
		System.out.println(discount);
	}

}
