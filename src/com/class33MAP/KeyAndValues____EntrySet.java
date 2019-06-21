package com.class33MAP;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyAndValues____EntrySet {
	public static void main(String[] args) {
		
		Map<String,String>userData=new LinkedHashMap();
		
		userData.put("Name","Alex");
		userData.put("Salary","95000");
		userData.put("Department","IT");
		userData.put("Title","Automation Tester");
		
		System.out.println(userData);
		
		userData.entrySet();//returns a set of Entries key+value
		
		for(Map.Entry set:userData.entrySet()) {
				
			System.out.println(set.getKey()+" : "+set.getValue());
		}
		
		for(Map.Entry map:userData.entrySet()) {
			System.out.println(map.getValue());
			
		}
		Iterator<Map.Entry<String,String>>it=userData.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			entry.getKey();
			entry.getValue();
		}
		
	
		
	}

}
