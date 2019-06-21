package com.class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class City {
	public static void main(String[] args) {
		String[] city = { "Moscow", "Minsk", "Warsaw", "Berlin", "Ekaterinburg" };

		Map<String, Integer> cityMap = new LinkedHashMap();

		for (String num : city) {
			if (num.length() < 7) {
				cityMap.put(num, num.length());
			}
		}

		for (Map.Entry<String, Integer> entry : cityMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		Iterator<Map.Entry<String, Integer>> it = cityMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = it.next();
			
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		
		
		Map<String, Integer> employee = new HashMap();
		employee.put("John", 55000);
		employee.put("Bohn", 155000);
		employee.put("Mohn", 515000);
		employee.put("Kolya", 255000);
		employee.put("Vasya", 455000);
		employee.put("Petr", 52000);

		int max = 0;
		String emplName="";
		/*
		for (Integer entry : employee.values()) {
			if (entry > max) {
				max = entry;
			}
		}
		*/


		for (Map.Entry<String, Integer> entry : employee.entrySet()) {
			
				if (entry.getValue()>max) {
					max=entry.getValue();
					emplName=entry.getKey();
				}
		}
		System.out.println(emplName+" has a largest salary of:"+max);

	}

}
