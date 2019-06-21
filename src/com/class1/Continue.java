package com.class1;

public class Continue {
	public static void main(String[] args) {

		label: for(int i=1;i<10;i++) {
			for(int b=0;b<i;b++) {
				if(b>3)continue label;
				System.out.print(i+" ");
				System.out.println();
			}
		}
	}

}
