package com.class34;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CollectionRecup {
	public static void main(String[] args) {
		
		Set<String>list=new LinkedHashSet();
		list.add("amba");
		list.add("borisevich");
		list.add("1boris");
		list.add("Woris");
		list.add("ioris");
		
		System.out.println(list);
		
		Map<String,Integer>map=new LinkedHashMap();
		map.put("1", 0);
		map.put(null, 2);
		
		
		System.out.println(map);
		
	}

}
