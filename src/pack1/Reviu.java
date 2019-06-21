package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Reviu {
	public static void main(String[] args) {
		List<String>list=new ArrayList(Arrays.asList("first","second","fourth","zero"));
		System.out.println(list);
		System.out.println(list.get(2));
		for(String run:list) {
			System.out.println(run);
		}
		System.out.println("------------------------------------------------------");
		list.add(3, "second");
		list.remove(0);
		Iterator<String>it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	
		
		
		
		
		
		/*
		
		Map<Integer,String>map=new TreeMap();
		map.put(0, "one");
		map.put(1, "second");
		map.put(2, "hello");
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Map.Entry run:map.entrySet()) {
			System.out.println("Key: "+run.getKey());
			System.out.println("Value: "+run.getValue());
		}
		
		Iterator<Entry<Integer, String>>it=map.entrySet().iterator();
		while(it.hasNext()) {
			if(it.next().getKey()==1) {
				it.next().setValue("orange");
			}
			
		}
		
		for(Map.Entry run:map.entrySet()) {
			System.out.println("Value: "+run.getValue());
		}
		*/
	}

}
