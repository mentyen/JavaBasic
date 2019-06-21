package com.class32_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList(Arrays.asList("A","B","house","123"));
		Collections.sort(list);
		System.out.println(list);
		
		
		String[]list1= {"House","Glass","Bike"};
		
		Arrays.sort(list1);
		for(String a:list1) {
			System.out.print(a+ " ");
		}
		System.out.println("\n*******************************************************************************");
		Arrays.sort(list1,Collections.reverseOrder());
		for(String a:list1) {
			System.out.print(a+ " ");
		}
		System.out.println("\n*******************************************************************************");
		HashSet<String> city=new HashSet(Arrays.asList("Pinsk","Minsk","Moscow","Vitebsk","Orlando","Pinsk"));
		System.out.println(city);
		for(String a:city) {
			System.out.print(a+" ");
		}
		System.out.println("\n*******************************************************************************");
		Iterator<String>it=city.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n*******************************************************************************");
		TreeSet<String>treeList=new TreeSet();
		treeList.addAll(city);
		
		System.out.print(treeList+" ");
		

	}

}
