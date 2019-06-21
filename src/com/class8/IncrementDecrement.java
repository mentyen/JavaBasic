package com.class8;

public class IncrementDecrement {
public static void main(String[] args) {
	int x=1;
	x=x+1;
	System.out.println(x);
	x+=1;
	System.out.println(x);
	x++;
	System.out.println(x);
	int w=2;
	w++;
	System.out.println(w);
	int y=10;
	y--;
	System.out.println(y);
	
	int a=10;
	int b=++a;// b=+1a;
	System.out.println(a+" "+b);//11
	
	
	int c=10;
	int d=c++;// d=10 and C will be 11 because we add 1 after we assign the value to D
	
	System.out.println( "Values a "+c);
	
	System.out.println("Values a "+d);
	
	int o=100;
	int r=o--;
	System.out.println(o + " "+r);
	
	int h=50;
	int m=--h;
	System.out.println(m +" "+h);
	

}
}
