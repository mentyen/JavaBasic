package com.class17_2;

public class Clock {
	void clock1() {
		//24 hours, 60 minutes
				for (int h=0; h<24; h++) {
					for (int m=0; m<60; m++) {
						if (m<10) {
							System.out.println(h+":0"+m);
							}
						else {System.out.println(h+":"+m);
						}
						}
					}
		
	}
	public static void main(String[] args) {
		//24 hours, 60 minutes
		Clock a=new Clock();
		a.clock1();
		}
	}


