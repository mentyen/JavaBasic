package com.class14_StringManipulation;

public class StringManipulation2 {
public static void main(String[] args) {
	
	
	//---------------------------1 replace() - will replace old char/value with new char/value
	
	
	
    String str="I am good tester!";
    String newStr=str.replace("a", "e");
    System.out.println(newStr);
    
    String newStr1=str.replace("good", "great");
    System.out.println(newStr1);
        // what we are looking for to replace, new value
    String newStr2=str.replace("tester", "programmer");
    System.out.println(newStr2);
    
    String newStr3=str.replace("Tester", "programmer");
    System.out.println(newStr3);
    
    str=str.replace("!", "?");
    System.out.println(str);
    
  //--------------------------------2 replaceAll() - will replace all that matches specified pattern[regex];
    
    
    String text="We333 did 2009 a wery nice -29hike yesterday!";
    String task=text.replaceAll("[^A-Za-z]", "");
    System.out.println(text.length());
    
    String newText=text.replaceAll("[0-9]", "");
    String new1Text=text.replaceAll("[A-Za-z]", "");
    System.out.println(newText+" "+new1Text);
    //[^abc] replace all accept what next;
   
    
    
	
  		String str1="12Hello 3234 World 465%^%";
  		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
  		System.out.println(replacedNoNumbers);
  		
  		String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
  		System.out.println(newString);
  		
//  		String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
//  		System.out.println(replacedNoCharacter);
  		
  		String str2="1Hello123";
  		System.out.println(str2.replaceAll("[^0-9]", ""));
  		
  	// ------------------------------------toCharArray() - converts string to array of characters
  		
  	  String text3="We did a great hike yesterday!";
  	  char[]text03=text3.toCharArray();
  	  for(int i=text03.length-1;i>=0;i--) {System.out.print(text03[i]);}
  	  
  	  System.out.println();
  	  for(char boom:text03)System.out.print(boom);
		System.out.println();
		
  			String string="saturday";
  			
  			char[] array=string.toCharArray();
  			for(int i=0; i<array.length; i++) {
  				System.out.print(array[i]);
  			}
  			
  			for (char c:array) {
  			       System.out.print(c);

  			}
  			
  			System.out.println();
  			System.out.println("Printing in reverse");
  			for (int i=array.length-1;i>=0; i--) {
  				System.out.print(array[i]);
  			}
  			
  			//-----------------------a.split("[abc]")-------------------------
  			String a="Is it saturday! Is it raining. Do we have a Java Class today?";
  			String []b=a.split("[?!.]");
  			System.out.println(b.length);
  			
  			String []c=a.split(" ");
  			String reversString="";
  			for(int i=c.length-1;i>=0;i--) {
  				reversString=reversString+c[i]+" ";
  				
  			}
  			System.out.println(reversString);
  		
}
}
