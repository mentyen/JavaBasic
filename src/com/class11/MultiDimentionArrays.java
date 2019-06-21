package com.class11;

public class MultiDimentionArrays {
public static void main(String[] args) {
	int[][] d=new int[4][4];//4*4=16elements
	int[][]c= {{1,2,3,4},
			   {2,3,4,5},
			   {12,34,56},
			   {747,456,36,3}};
	
	String[][] groups= {
			{"Toly","Moly","Boly","Sholi"},
			{"Inna","Minna","Sinna","Vinna"}};
	System.out.println(groups[0][1]);
	
	d[0][0]=12;
	d[0][1]=13;
	d[0][2]=14;
	d[0][3]=15;
	
	d[1][0]=1;
	d[1][1]=13;
	d[1][2]=14;
	d[1][3]=15;
	
	d[2][0]=5;
	d[2][1]=10;
	d[2][2]=15;
	d[2][3]=20;
	
	d[3][0]=100;
	d[3][1]=200;
	d[3][2]=300;
	d[3][3]=400;
	
	System.out.println(d[3][2]);
}
}
