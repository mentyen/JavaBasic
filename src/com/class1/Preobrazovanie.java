package com.class1;

public class Preobrazovanie {
public static void main(String[] args) {
	int a=3;
	int b=10;
	double res1=(double)b/a;
	System.out.println(res1);
	
	double a1=10;
	double b1=3;
	double res2=(int)a1/b1;
	String res3=String.valueOf(res2);// preobrazovali v string
	res3=res3+" "+res3;
	System.out.println(res3);
	int res4=Integer.parseInt(res3);
	System.out.println(res4);
	
	
	
	/*
	String str= "123.9";
	String qwe="23";
	String res=str+qwe;
	
	System.out.println(res);
	
	
	// Integer, Float,Character,Long,Boolean 
	//Obolochka opisivaet class svoego tipa
	
	Integer integ=90;

	double a=Double.parseDouble(str);// method parceDouble();
	//int a=Integer.parseInt(str);
	int b=Integer.parseInt(qwe);
	double resInt=a+b;
	
	String r=String.valueOf(resInt);
	r=r+r;// Concatination of strings
	System.out.println(resInt);
	System.out.println(r);
	
	*/
}
}
