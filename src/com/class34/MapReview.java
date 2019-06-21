package com.class34;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapReview {
	public static void main(String[] args) {
		Map<String,Integer>grossery=new LinkedHashMap();
		grossery.put("Milk", 1);
		grossery.put("Butter", 2);
		grossery.put("Pasta", 3);
		grossery.put("Potato", 500);
		grossery.put("Apples", 450);
		
		System.out.println(grossery.size());
		grossery.replace("Potato", 700);
		System.out.println(grossery);
		grossery.remove("Butter");
		grossery.put("Avocado", 75);
		
		System.out.println(grossery);
		
		
		for(String product:grossery.keySet()) {
			System.out.println(product+" has a amount of "+grossery.get(product));
		}
		Iterator<String>it=grossery.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("Key is "+key+ " and value is "+ grossery.get(key));
		}
		
		
		for(Integer value:grossery.values()) {
			System.out.println(value+ " this is a value");
		}
		
		Iterator<Integer>itValue=grossery.values().iterator();
		while(itValue.hasNext()) {
			System.out.println(itValue.next()+" this is a value");
		}
		
				
		
	System.out.println("-----------------------------USING MAP.ENTRY_-------------------------");
		Iterator<Map.Entry<String,Integer>>itEntry=grossery.entrySet().iterator();
		while(itEntry.hasNext()) {
			Map.Entry entry=itEntry.next();
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		
		for(Map.Entry<String,Integer> set:grossery.entrySet()) {
			System.out.println(set.getKey() +" "+ set.getValue());
		}
		
	}

}
