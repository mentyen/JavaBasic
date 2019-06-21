package com.class11;

public class Homework {
	public static void main(String[] args) {
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
		boolean res=false;
		int row=0;
		int col=0;
	
		for(int i=0;i<a.length;i++) {
			row=i;
			for(int b=0;b<a[i].length;b++) {
					col=b;
		}
		
	}
		if(row==col) {
			res=true;
			System.out.println(res);
		}

}}
