package com.class33MAP;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class CountryMAp {
	public static void main(String[] args) {
		
		Map<String,String>capital=new TreeMap();
		capital.put("Russia", "Moscow");
		capital.put("Belarus", "Minsk");
		capital.put("Ukrain", "Kiev");
		capital.put("Usa", "Washington");
		capital.put("Turkey", "Ankara");
		capital.put("Taiwan", "TaiPei");
		
		
		
		
		Collection<String>key=capital.keySet();
		
		for(String key1:key) {
			System.out.println(key1+" ");
		}
		System.out.println("*************************************************************");
		
		Iterator<String>it=key.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*************************************************************");
		
		for(String s:key) {
			System.out.println(s+" for "+capital.get(s));
		}
		System.out.println("*************************************************************");
		it=key.iterator();
		while(it.hasNext()) {
			String country=it.next();
			System.out.println(country+" x "+capital.get(country));
		}
		System.out.println("*************************************************************");
		
		for(String s:key) {
			System.out.println(s+" ***"+capital.get(s));
		}
		System.out.println("*************************************************************");
		
		Collection<String>cityCap=capital.values();
		
		Iterator<String>itCity=cityCap.iterator();
		while(itCity.hasNext()) {
			System.out.print(itCity.next()+" ");
		}
		

	}
	}
