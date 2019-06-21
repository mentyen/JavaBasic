package com.class22_Constructors;

public class SyntaxStudent {
	/*schoolName
	 * batchNumber
	 * Name
	 * LastName
	 * 
	 *
	 * */
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	public String name;
	public String lastName;
	
	public SyntaxStudent(String names,String lastNames) {
		name=names;
		lastName=lastNames;
	}
	public void getStudentsInfo() {
String details="I am a student at "+schoolName+" from batch "+batchNumber+"\nMy name is "+name+" and a Last name "+lastName;
System.out.println(details);
}
}