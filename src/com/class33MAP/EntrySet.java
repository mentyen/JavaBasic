package com.class33MAP;

import java.util.*;

public class EntrySet {
	public static void main(String[] args) {
		Map<String,Integer>classMap=new LinkedHashMap();
		classMap.put("Table", 20);
		classMap.put("Chairs", 60);
		classMap.put("Screen", 3);
		classMap.put("Students", 60);
		classMap.put("Instructors", 3);
		
		System.out.println(classMap);
		
	for(Map.Entry entry:classMap.entrySet()) {
		System.out.println(entry.getValue()+":"+entry.getKey());
	}
	System.out.println("****************************ITERATOR**********************************");
	Iterator<Map.Entry<String, Integer>>iteratorOfClassMap=	classMap.entrySet().iterator();
	while(iteratorOfClassMap.hasNext()) {
		Map.Entry entry=iteratorOfClassMap.next();
		System.out.println(entry.getKey()+"--"+entry.getValue());
	}
		
		
		
	}

}
