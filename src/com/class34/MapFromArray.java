package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {
	public static void main(String[] args) {
		String[]name= {"Ahmed","Zarif","Usup","Omar"};
		Map<Integer,String>nameMap=new LinkedHashMap();
		int i=1;
		for(String n:name) {
			nameMap.put(i, n);
			i++;
		}
		System.out.println(nameMap);
		
		for(Map.Entry<Integer, String> list:nameMap.entrySet()) {
			System.out.println(list.getKey()+" "+list.getValue()+ " by advance four");
		}
		
		Iterator<Map.Entry<Integer,String>>itList=nameMap.entrySet().iterator();
		while(itList.hasNext()) {
			Map.Entry entry=itList.next();
			System.out.println(entry.getKey()+" "+entry.getValue()+ "  by iterator");
		}

	}
}
