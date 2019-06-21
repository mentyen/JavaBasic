package com.class32_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {
	public static void main(String[] args) {
		HashSet<Integer>hset=new HashSet();
		hset.add(12);
		hset.add(32);
		hset.add(52);
		hset.add(362);
		hset.add(32);
		
		System.out.println(hset.size());
		for(int num:hset) {
			System.out.println(num);
		}
		
		Iterator<Integer>it=hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
	}

}
