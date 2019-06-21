package com.class5;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter the quiz score: ");
    double quiz = userInput.nextDouble();
    
    System.out.println("Enter the mid term score: ");
    double midTerm = userInput.nextDouble();
    
    System.out.println("Enter the final score: ");
    double finalScore = userInput.nextDouble();
	
   
   double  avgScore=(quiz+midTerm+finalScore)/3;
   
   if(avgScore>=90) {
	   System.out.println("A");
   }
   else if(avgScore>=70 && avgScore<90){
	   System.out.println("B");
   }
   else if(avgScore>=50 && avgScore<70) {
	   System.out.println("C");
   }
   else {
	   System.out.println("F");
   }
}
}
