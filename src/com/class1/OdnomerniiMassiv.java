package com.class1;

public class OdnomerniiMassiv {
public static void main(String[] args) {
	
	/*
	int[]mas=new int[355];
	int sum = 0;
	int count=0;
	int min=mas[0];
	
	for(int i=0;i<mas.length;i++) {
		
		mas[i]=(int)Math.round(Math.random()*100);
		
		if(mas[i]<min) {
			min=mas[i];
		}
			
	}
	*/
	int[]mass= {7,3,1,4,5,39,49,-2};
	int min1=mass[0];
	int secMin=mass[0];
	for(int i=0;i<mass.length;i++) {
		
		if(mass[i]<min1) {
			secMin=min1;
			min1=mass[i];
			
		}
		else if(mass[i]<secMin) {
			secMin=mass[i];
		}
	}
	System.out.println("SecMin: "+secMin);
		
	System.out.printf("min2: %d",min1);
	System.out.println();
	//System.out.println("min: "+min);
	//System.out.println("sum: "+sum);
	System.out.println();
	//System.out.println("count: "+count);
	
	//for(int i=0;i<mas.length;i++) {
	//	System.out.print(mas[i]+" ");
	//}
}
}
