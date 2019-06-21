package com.class19Static;

public class Minimum {
	
	static int minOfValues(int[]array) {
		int min = array[0];
		   
	      for(int i = 0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	}

}
