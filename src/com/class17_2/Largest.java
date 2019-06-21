package com.class17_2;

public class Largest {
	
	
	private int ret(int i,int b,int c) {
		int largest;
		if(i>b&&i>c) {
			largest=i;
				
		}
		else if(b>i&&b>c) {
			largest=b;
			
			}
			else { largest=c;}
		
		return largest;
		
	}
	public static void main(String[] args) {
		Largest num=new Largest();
		int b=num.ret(-19,-2,3);
		System.out.println(b);
		
	
	}

}
