package com.class30_Collection;

import java.util.ArrayList;


import java.util.Iterator;

public class Task_Array {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		
		names.add("Abba");
		names.add("Boris");
		names.add("Carl");
		names.add("Diana");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Boob"));
		System.out.println(names.size());
		
		for(String list:names) {
			System.out.println(list);
		}
			
			System.out.println("---1 way using for loop---");
			for (int i=0; i<names.size(); i++) {
				System.out.println(names.get(i));
			}
			System.out.println("---2 way using advance for loop---");
			for (Object name:names) {
				System.out.println(name);
			}
			
			System.out.println("---3 way using iterator---");
			Iterator<String> it=names.iterator();
			//boolean check=it.hasNext();
			while(it.hasNext()) {
				System.out.println(it.next());
			
				}
		System.out.println("----------------------NON GENERIC ARRAYLIST---------------------");
			//NON GENERIC ARRAYLIST
			ArrayList num1=new ArrayList();
			num1.add(12);
			num1.add("Vova");
			num1.add('a');
			
			for(Object value:num1) {
				System.out.println(value);
			}
			System.out.println("---3 way using iterator---");
			Iterator<String>iter=names.iterator();
			//boolean check=it.hasNext();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
		}
	}


