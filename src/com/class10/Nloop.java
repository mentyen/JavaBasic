package com.class10;

public class Nloop {
public static void main(String[] args) {
	for(int i=0;i<=5;i++) {
		System.out.print(i);
	}
	for(int i=0;i<=5;i++) {
		System.out.print(i);
	}
	for(int i=0;i<=5;i++) {
		System.out.print(i);
	}
	for(int i=0;i<=5;i++) {
		System.out.print(i);
	}
	System.out.println();
	String x="*";
	for(int i=1;i<5;i++) {
		
		System.out.println(x);
		x=x+"*";
	}
	
	for(int i=1;i<5;i++) {
		for(int b=5;b>0;b--) {
			System.out.print(b);
		}
		System.out.println();
	}
	for(int b=5;b>0;b--) {
		for(int i=1;i<5;i++) {
			System.out.print(b);
		}
		System.out.println();
		}
	
	for(int i=1;i<5;i++) {
		for(int b=1;b<=i;b++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
          
     int midRow = 3;
     int row = 1;
 
      
     for (int i = 3; i > 0; i--) {
                  for (int j = 1; j<= i; j++) {
        
             System.out.print(" ");
         }
           for (int j = 1; j <= row; j++) {
        
             System.out.print("* ");
         }
         System.out.println();
         row++;
     }
      
    ////
         
     for (int i = 0; i <= midRow; i++) 
     {
        
          
         for (int j = 1; j <= i; j++) 
         {
             System.out.print(" ");
         }
          
       
          
         for (int j = row; j > 0; j--) 
         {
                 System.out.print("* ");
         }
          
         System.out.println();
          
       
          
         row--;
     }
     
     int temp=1;
     for(int i=5;i>0;i--) {
    	 for(int b=1;b<=i;b++) {
    		 System.out.print(" ");
    	 }
    	 //int temp=1;
    	 for(int c=1;c<=temp;c++) {
    	 System.out.print("* ");
    	 }
    	 System.out.println();
    	 temp++;
     }
     
     for(int d=2;d<=5;d++) {
    	 for(int g=1;g<=d;g++) {
    		 System.out.print(" ");
    	 }
    		 for(int m=3;m<=temp;m++) {
    			 System.out.print("* ");
    		 }
    		 System.out.println();
        	 temp--;
    	 }
    	     }
	
}

