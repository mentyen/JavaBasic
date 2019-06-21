package com.class33MAP;

import java.util.HashMap;
import java.util.Map;

public class Map_and_Static_Method {
	public static void isEmpty(Map<String,Integer>map) {
		if(map.isEmpty()) {
			System.out.println("Map is empty");
		}
		else {
			System.out.println(map);
		}
	}
	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap();
		map.put("One", 23);
		Map_and_Static_Method.isEmpty(map);
		map.clear();
		Map_and_Static_Method.isEmpty(map);
		
	}

}
