package com.class1;

public class SlojNiiMassive {
	public static void main(String[] args) {
		
		int [][] mas=new int[15][];
		int count=0;
		for(int i=0;i<mas.length;i++) {
				
			  mas[i]=new int[i+1];
										
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=1;
			   }
			count++;
		}
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("count add lines: "+ count);
	}

}
