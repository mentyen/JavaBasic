package com.class3;

public class Modulus {
	public static void main(String[] args) {

	

	int a = 10;
    int b=3;
    int div=a/b;

   System.out.println(div);
   
   //modulus operator oststok ot deleniya %
   
   int mod = a%b;
   
   System.out.println(mod);
   
   int q=47;
   int w = 10;
   System.out.println(q%w);// result is left over
   //parentheses,Exponents, Multiplication/division,modulus, Add/Substract
   
   int e=-5+4*6;//*execute first
   
   System.out.println(e);//19
   
   int x= (22+9)%7;//forentoses executes first
   System.out.println(x);//3
   
   //5+10-2=13
   int y = 5+(15/3*2)-(8%3);
   System.out.println(y);//13
   
   System.out.println(2 * (3 + 4 * (5 + (6 * 7))));

}}
