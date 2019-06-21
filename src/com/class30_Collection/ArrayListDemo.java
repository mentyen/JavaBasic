package com.class30_Collection;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Hello");
	list.add("Welcome");
	list.add("Hi");
	list.add("Buye");
	System.out.println(list.get(1));
	System.out.println(list.size());
	
	list.add("more");
	
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
	System.out.println("---------------------------------");
	for(String a:list) {
		System.out.println(a);
	}
	System.out.println("---------------------------------");
	ArrayList<Integer>  num=new ArrayList<>();
	for(int i=0;i<10;i++) {
		num.add(i);
	}
	
	num.set(6, 50);
	for(int a:num) {
		System.out.print(a+" ");
	}
}
}
