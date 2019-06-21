package com.class22_Constructors;

public class TestSyntaxStudents {
	public static void main(String[] args) {
		/*
		SyntaxStudent st1=new SyntaxStudent();
		st1.name="Tolik";
		st1.lastName="Tetenkin";
		st1.getStudentsInfo();
		
		SyntaxStudent st2=new SyntaxStudent();
		st2.name="Ali";
		st2.lastName="Aziz";
		st2.getStudentsInfo();
		*/
		SyntaxStudent st1=new SyntaxStudent("Tolik","Tetenkin");
		st1.getStudentsInfo();
		SyntaxStudent st2=new SyntaxStudent("Aziz","Muchun");
		st2.getStudentsInfo();
	}

}
