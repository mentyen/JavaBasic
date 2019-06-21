package com.class17Method;

public class Test {
	
	void result(int a,int b) {//parameters
		if(a>b)System.out.println(a+" larger then "+b);
		else System.out.println(b+" larger then "+a);
		
	}
	
	void compare(int i) {
		if(i%2==0)System.out.println("The number is EVEN");
		else System.out.println("The number is ODD");
	}
	void palindrome(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str))System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
	}
	
	public static void main(String[] args) {
		Test a=new Test();
		a.result(3, 9);//argument
		a.compare(4);
		a.palindrome("moma");
	}

}
