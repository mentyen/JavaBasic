package com.class33MAP;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BestBuy {
	public static void main(String[] args) {
		Map<Integer,String>store=new LinkedHashMap();
		store.put(76644401, "Printer HP");
		store.put(76644402, "Scanner HP");
		store.put(76644403, "Monitor HP");
		store.put(76644404, "LapTop HP");
		store.put(76644405, "Projector HP");
		
		
		Iterator<Map.Entry<Integer,String>>itStore=store.entrySet().iterator();
		while(itStore.hasNext()) {
			Map.Entry entry=itStore.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		System.out.println("**************************************************************************");
		for(Map.Entry entry:store.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
