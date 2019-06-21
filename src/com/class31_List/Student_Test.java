package com.class31_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Student_Test {
	public static void main(String[] args) {
		Student obj=new Student("John",23);
		Student obj1=new Student("moon",21);
		Student obj2=new Student("Kolya",25);
		Student obj3=new Student("Vasilii",20);
		
		ArrayList<Student> alist=new ArrayList(Arrays.asList(obj,obj1,obj2,obj3));
		
		for(Student a:alist) {
		a.print();
		
		}
		
	
		Iterator<Student> it=alist.iterator();
		while(it.hasNext()) {
			Student x=it.next();
			//x.name;
			//x.age;
			//x.print();
		}
		
		
		

	}
}
