package com.class11;

public class TwoDimantinalTest {
	public static void main(String[] args) {
		String[][]name={
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}};
		
		System.out.println(name[0][1]+name[1][0]);
		System.out.println(name[0][0]+name[1][3]);
		System.out.println(name[0][2]+name[1][2]);
		System.out.println(name[0][3]+name[1][1]);
		
		String[][]b= {
				{"Peter","Mark","Mier","Joshua"},
				{"A","B","C","D"}};
		System.out.println("Student " + b[0][0]+ " Has a grade: "+ b[1][0]);
		System.out.println("Student " + b[0][1]+ " Has a grade: "+ b[1][1]);
		
		}
	}


