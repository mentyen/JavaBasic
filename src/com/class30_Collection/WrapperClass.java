package com.class30_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WrapperClass {
	public static void main(String[] args) {
		Integer int1=new Integer(10);//BOXING
		Integer int2=20;//AUTOBOXING
		System.out.println(int1);
		
		int num=int1.intValue();//UNBOXING
		System.out.println(num);
		
		int num2=int2;//AUTO_UNBOXING:
		
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(12);
		numbers.add(0, 13);
		numbers.set(0, 22);
		System.out.println(numbers.size()); 
		
		
		ArrayList list=new ArrayList(Arrays.asList(1,2,3,4,5,6,7));
		for(Object a:list) {
			System.out.print(a);
		}
		System.out.println();
		System.out.println("___________________________________________________________");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		System.out.println("___________________________________________________________");

	
		Iterator<Integer> it=list.iterator();
		
	//	it.hasNext();	it.next(); 		it.remove();
		
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
		System.out.println("___________________________________________________________");
		
		int c=0;
		while(list.size()>c) {
			System.out.print(list.get(c));
			c++;
		}
		
	}
	
	

}
