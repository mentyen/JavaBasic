package com.class33MAP;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapBuildings {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap();
		map.put(1, "Target");
		map.put(2, "Costco");
		map.put(4, "Amazon");
		map.put(4, "Google");
		map.put(5, "eBay");
		map.put(6, "eBay");
		map.put(7, "USPS");
		
		System.out.println(map);
		map.replace(4,"Paypal");
		map.remove(7);
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Map<Integer,String>map1=new HashMap();
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(3, "c");
		map1.put(3, "d");
		map1.put(4, "e");
		
		System.out.println(map1);
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		//---------------------GETTING A KEYS FROM A MAP------------------------
		
		Set<Integer>keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key+" :"+ map.get(key));
		}
		
		Iterator<Integer>it=keys.iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(key+" ;"+map.get(key));
		}
		//----------------------------GETTING A VALUE FROM A MAP------------------------
		Collection<String>valueColl=map.values();
		for(String valueS:valueColl) {
			System.out.print(valueS+" ");
		}
		Iterator<String>iterValue=valueColl.iterator();
		while(iterValue.hasNext()) {
			System.out.print(iterValue.next()+" ");
		}
		
		//_________________________________ENTRY SET------------------------------------
		
		map.entrySet(); map.keySet(); 
		//Map.Entry<K, V> to get the entry out of the map
		
	}

}
