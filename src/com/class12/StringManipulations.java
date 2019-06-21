package com.class12;

public class StringManipulations {
	public static void main(String[] args) {
		
		String str="Syntax Technologies";
		int length=str.length();
		System.out.println(length);
		
		System.out.println("_________________LENGTH_____________");
		String str2="Welcome, Students!";
		int res=str2.length();
		System.out.println(res);
		
		System.out.println("_____________Lower and Upper case________");
		String str3="Hello";
		String res3=str3.toUpperCase();
		String res3a=str3.toLowerCase();
		System.out.println(res3);
		System.out.println(res3a);
		
		String str4="Hello";
		String str5="hello";
		
		boolean result=str4.equals(str5);
		System.out.println(result);
		
		System.out.println("__________equals IGNORE Case_______");
		String expectedBrowser="Crome";
		String axualBrowser="crome";
		
		boolean res6=expectedBrowser.equalsIgnoreCase(axualBrowser);
		System.out.println(res6);
		
		System.out.println("____________CONTAINS_________");
		String str8="Good morning, Students!";
		boolean contains=str8.contains("Students");
		System.out.println(contains);
		
		String present="Welcome,Asel";
		String needValue="Welcome,";
		
		boolean flag=present.contains(needValue);
		System.out.println(flag);
		
		boolean flag2=present.toLowerCase().contains(needValue);
		System.out.println(flag2);
		
		System.out.println("StartsWith_______________EndsWith.");
		String string="syntax";
		boolean enter=string.startsWith("s");
		boolean exit=string.endsWith("x");
		System.out.print(enter+" "+exit+"\n");
		
		System.out.println("_________________isEmpty___________");
		String string1="Not empty";
		boolean resultat=string1.isEmpty();
		System.out.println(resultat);
		
		System.out.println("__________________.concat()__________");
		String s="Hello ";
		String a="Alli!";
		System.out.println(s+a);//concatination 2 strings
		System.out.println(s.concat(a));//same thing as a+s;
		
		System.out.println("____________TRIM_______________");
		
		String expected="More than just car insurance";
		String actual=" More than just car insurance ";
		actual=actual.trim();//will trim all spaces from a end and a begining 
		System.out.println(expected.equals(actual));
		
		System.out.println("___________Char(ad)______________");
		String stringA="Student";
		char info=stringA.charAt(3);
		System.out.println(info);
		
		for(int i=0;i<stringA.length();i++) {
			System.out.print(stringA.charAt(i)+"\t");
			System.out.println();
		}
		System.out.println("_____________indexOf()_____________");
		String nov ="Sunday";
		int index=nov.indexOf("u");
		System.out.println(index);
		
		System.out.println();
		String nov1="Syntex Technologies";
		System.out.println(nov1.indexOf("Syntex"));
		
		int count=0;
		for(int b=0;b<nov1.length();b++) {
			if(nov1.charAt(b)==nov1.charAt(4)){
				count+=1;
				
			}
		}
		System.out.println(count);
		System.out.println(nov1.indexOf("e"));
		
		
		System.out.println("____________________substring_____________");
		//you specify from each index you will start your String
		String new2="Today is Sunday Java class";
		String newString=new2.substring(5);
		System.out.println(newString);
		System.out.println(new2.substring(16,20));
		System.out.println(new2.substring(21));
	
		
		String uno="Barsic";
		String uno1="Barsic123";
		boolean resultatus=uno.contains(uno1);
		System.out.println(resultatus);
		
		
	
	}
	

}
