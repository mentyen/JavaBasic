package com.class12;

public class ForEachLoop {
	public static void main(String[] args) {
		int[][] rating = { 
				{ 2, 6, 9, 3, 7 }, 
				{ 1, 7, 9, 4, 8 },
				{ 0, 4, 6, 2, 5 }, 
				{ 0, 1, 2, 3 } };
		int sum = 0;
		
		
		
		for(int i=0;i<rating.length;i++) {
			
				sum+=rating[i][2];
			}
		System.out.println(sum);
		System.out.println(rating.length);
		}
				
	}


