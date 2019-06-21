package com.class1;

public class DvoinoiMassiv {
	public static void main(String[] args) {
		String[][] mas = new String[5][5];
        
        
		for (int i = 0; i < mas.length; i++) {
			if(i==0 || i==4) {
				for(int j=0;j<mas[i].length;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
			   for (int j = 0; j <mas[i].length; j++) {
				    if(j==0 ||j==4) {
				       System.out.print("* ");
				    }
				
				    else System.out.print(" "+" ");				
			   }
			System.out.println();
			}}
		
			
		}
	}


