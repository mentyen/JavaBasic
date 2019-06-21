package com.class33MAP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {
	public static void main(String[] args) {
		
	Set<String>classDays=new TreeSet();
		classDays.add("Tuesday");
		classDays.add("Wendsday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		
		Iterator<String>it=classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//We will need to copy collection in to the ArrayList to get a specific value
		List<String>list=new ArrayList(classDays);
		System.out.println(list.get(2));
		
		
		List<String>list2=new ArrayList();
		list2.addAll(classDays);// another way to add the value in to a arrayList
		
		
		//2 WAY CONVERTING TO ARRAY
		Object[] array=classDays.toArray();
		System.out.println(array[0]);
		
		
	}

}
