package com.class21_Variables;
import java.util.Random;
import java.util.Scanner;
public class Students {
	//import java.util.Scanner;



	   public static void main(String[] args) {
	       // TODO Auto-generated method stub
	   String computerPick;;
	   String userPick;;

	       do {
	           computerPick = computerWord();
	           userPick = userWord();

	           if(computerPick.equalsIgnoreCase("rock") && userPick.equalsIgnoreCase("scissors")) {
	               System.out.println("Computer picked "+computerPick+" and won!");
	           }else if(computerPick.equalsIgnoreCase("scissors") && userPick.equalsIgnoreCase("rock")) {
	               System.out.println("you picked "+userPick+" and won!");
	           }else if(computerPick.equalsIgnoreCase("scissors") && userPick.equalsIgnoreCase("paper")) {
	               System.out.println("Computer picked "+computerPick+" and won!");
	           }else if(computerPick.equalsIgnoreCase("paper") && userPick.equalsIgnoreCase("scissors")) {
	               System.out.println("you picked "+userPick+" and won!");
	           }else if(computerPick.equalsIgnoreCase("paper") && userPick.equalsIgnoreCase("rock")) {
	               System.out.println("Computer picked "+computerPick+" and won!");
	           }else if(computerPick.equalsIgnoreCase("rock") && userPick.equalsIgnoreCase("paper")) {
	               System.out.println("you picked "+userPick+" and won!");
	           }else if(computerPick.equalsIgnoreCase(userPick)) {
	               System.out.println("Tie, computer picked "+computerPick+" and you picked "+userPick+"!");
	           }
	       }while(computerPick.equalsIgnoreCase(userPick));
	   }

	   public static String computerWord() {

	       String str = "";

	       Random rand = new Random();

	       int num = rand.nextInt(3)+1;

	       switch(num) {

	       case 1:
	           str = "rock";
	           break;
	       case 2:
	           str = "paper";
	           break;
	       case 3:
	           str = "scissors";
	           break;
	       }

	       return str;
	   }

	   public static String userWord() {

	       int num;
	       String str = "";

	       Scanner userChoice = new Scanner(System.in);

	       System.out.println("Pick a number from the menu:\n1: Rock\n2: Paper\n3: Scissors");
	       num = userChoice.nextInt();

	       switch(num) {

	       case 1:
	           str = "rock";
	           break;
	       case 2:
	           str = "paper";
	           break;
	       case 3:
	           str = "scissors";
	           break;
	       }

	       return str;

	   }
	}

	