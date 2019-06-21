package com.class10;

public class Clock {
public static void main(String[] args) {
	for(int h=0;h<1;h++) {
		for(int m=0;m<60;m++) {
			for(int c=0;c<60;c++) {
				if (m<10){
					if(c<10) {
					System.out.println(h+":0"+m+":0"+c);
					}
					else {System.out.println(h+":0"+m+":"+c);}
				}
				else if(c<10){
				System.out.println(h+":"+m+":0"+c);
				}
			}
		}
		
	}
}
}
