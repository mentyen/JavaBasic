package com.class22_Constructors;

public class Students {
	public String name;
	public int sub1grade;
	public int sub2grade;
	public int sub3grade;
	
	public Students(String stName,int s1grade,int s2grade,int s3grade) {
		name=stName;
		sub1grade=s1grade;
		sub2grade=s2grade;
		sub3grade=s3grade;
	}
	
	public void average() {
		int av=sub1grade+sub2grade+sub3grade/3;
		System.out.println(name+" "+av);
	
	}
	
	public static void main(String[] args) {
		Students obj1=new Students("Murzik",70,44,50);
		Students obj=new Students("Vova",12,14,55);
		Students obj2=new Students("Musik",33,24,90);
		Students obj3=new Students("Moma",100,33,99);
		
	    obj.average();
	
		
		
	}

}
