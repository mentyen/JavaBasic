package com.class33MAP;

import java.util.*;


public class MapInfo {
	public static void main(String[] args) {
		//key + value
		Map<Integer,String>map=new HashMap();
		
		map.put(101, "First");
		map.put(102, "Second");
		map.put(103, "Third");
		map.put(104, "Fourth");
		
		System.out.println(map.get(102));
		
		System.out.println(map.size());
		
		map.replace(103, "Third replaced");
		System.out.println(map.get(103));
		
		map.remove(101);
		map.remove(102, "Second");
		System.out.println(map.get(101));
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsValue("First"));
		
		map.put(105, "Fourth");
		System.out.println(map);
		
		map.put(101, "First");
		map.put(102, "Second");
		System.out.println(map);
		map.put(null, "Some value");
		System.out.println(map);
		map.put(null,null);
		System.out.println(map);
	}

}
