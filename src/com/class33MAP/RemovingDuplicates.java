package com.class33MAP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicates {
	public static void main(String[] args) {
		List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        
        for(int i=0;i<aList.size();i++) {
        	if( aList.contains(aList.get(i))) {
        		aList.remove(i);
        	}
        }
      System.out.println(aList);
      
      System.out.println("***********************************");
        
        Set<String>list=new HashSet(aList);
        System.out.println(list);
	}

}
