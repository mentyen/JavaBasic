package com.class13;

public class StringPractice {
	public static void main(String[] args) {
		/*
		 *  Create a String that will hold a sentence.
		 *  Write a program to get a new String without any spaces.
		 * Create a String that should be combination of letters, numbers and special characters.
		 *  Find out how many alpha characters are there in the String.

          You have a String a=“Today is a good day. It is Thursday. We have a Java Class”. 
          How would you find out how many sentences are in that String?
		 * 
		 */
		String a="This is a beautiful world";
		String b="";
	
		for(int i=0;i<a.length();i++) {
			if(!(a.charAt(i)==' '))b=b+a.charAt(i); 
					
		}
		System.out.print(b);
		
			
		
		System.out.println();
		
		String c="Ansd12%jf+=";
		int count = 0;
		for(int i=0;i<c.length();i++) {
			char letter=c.charAt(i);
			if(Character.isLetter(letter)) {
				count++;
			}
		}
		
		System.out.println(count);
		count=0;
		String ta="Today is a good day. It is Thursday. We have a Java Class.";
		for(int i=0;i<ta.length();i++) {
			if(ta.charAt(i)=='.'||ta.charAt(i)=='!'||ta.charAt(i)=='?')count++;
		}
		System.out.println("You have "+count+" sentences at this string");
				
	}

}
