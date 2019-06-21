package com.class14_StringManipulation;

public class testing {
	public static void main(String[] args) {
	// Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		String str1="Hello";
		String str2="World";
		System.out.println("Replace int :"+str1.replace("Hello", "World"));
		System.out.println(str2.replace("World", "Hello"));
		
		str1=str1+str2;
		str1=str1.concat(str2);//HelloWorld
		str2=str1.substring(0,str1.length()-str2.length());//"Hello"
		str1=str1.substring(str2.length());
		System.out.println(str1 +" "+ str2);
		
		System.out.println("Replace int :"+str1.replace("Hello", "World"));
		System.out.println(str2.replace("World", "Hello"));
		
		// Second largest
		
		int arr[]= {3,45,6,0,86,292,-1};
		
		int larg=0;
		int secLarg=0;
		int min=arr[0];
		int secMin=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>larg) {
				secLarg=larg;
				larg=arr[i];
				
			}
			if(arr[i]<min) {
				
			    secMin=min;
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secLarg&&arr[i]<larg) {
				secLarg=arr[i];
			}
		}
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<min&&arr[i]>secMin) {
					secMin=arr[i];
				}
			}
		
		
		System.out.println(larg+ " "+secLarg+" min = "+min+" "+secMin);
		
		}
	}


