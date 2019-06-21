package com.class1;

public class While1 {
	public static void main(String[] args) {
		int i=-100;
		int sum=0;
		int count=0;
		double evr;
		while(i < 200) {
			if((i%4)==0) {
				sum+=1;
				
			}
			i++;
			count++;
		}
		evr=(double)sum/count;
		System.out.println(evr);
	}

}
