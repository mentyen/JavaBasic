package com.class6;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your numbers:");
		int x=input.nextInt();
		int y=input.nextInt();
		System.out.println("Enter your operator:");
		char operator=input.next().charAt(0);
        double result = 0;
            
        switch (operator) {
        
        case '+':
            result=x+y;
            break;
        case '-':
        	result=x-y;
            break;
        case '*':
        	result=x*y;
            break;
        case '/':
        	result=x/y;
            break;
       /*
      
        default:
        	System.out.println("Enter one of the following operators:+,-,*,/");
            return;
            */
        }
     System.out.println(result);
	}

}
