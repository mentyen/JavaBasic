package com.class11;

public class Recap {
	public static void main(String[] args) {
		//declare    initializing
		String[]name=new String[7];
		name[0]="Asel";
		name[1]="Awet";
		name[2]="Weqas";
		name[3]="Dmitry";
		name[4]="Shiva";
		name[5]="Avat";
		name[6]="Sandesh";
		
		for( String print : name) {
			System.out.println(print);
		}
		for(int i=0;i<name.length;i++)System.out.print(name[i]+"\t");
		System.out.println();
		
		// Create an array by using literal
		
		String[]studentsNames= {"Inna","Toly","Shaban","Bilal","Zaki"};
		
		for(String print:studentsNames)System.out.print(print+"\t");
		for(int i=0;i<=studentsNames.length-1;i++)System.out.print(studentsNames[i]+"\t");
		//advance for loop, enhanced for loop
		for(String print:studentsNames)System.out.println(print);
	}

}
