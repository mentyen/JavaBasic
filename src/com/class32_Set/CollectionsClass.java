package com.class32_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {
	public static void main(String[] args) {
		ArrayList<Integer>intList=new ArrayList();
		intList.add(112);
		intList.add(22);
		intList.add(-33);
		intList.add(45);
		intList.add(55);
		
		Collections.sort(intList);
		System.out.println(intList);
		int[]integerArray= {12,44,2,6,43,7};
		Arrays.sort(integerArray);
		System.out.println("Array after sorting");
		for(int sort:integerArray) {
			System.out.print(sort+" ");
		}
	}
	

	
}
