package com.class31_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
		ArrayList car=new ArrayList(Arrays.asList("audi","volvo","subaru","mercedes","tesla"));
		for(Object a:car) {
			System.out.println(a);
		}
		for(int i=0;i<car.size();i++) {
			System.out.println(car.get(i));
		}
		Iterator<String> b=car.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		int c=0;
		while(car.size()>c) {
			System.out.println(car.get(c));
			c++;
		}
		
		
		
	}

}
