package com.class32_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test_Insurance {
	public static void main(String[] args) {
		Insurance car=new Car("Gaico","Audi");
		Insurance pet=new Pet("Statefarm","Dog");
		Insurance health=new Health("Statefarm");
		
		List<Insurance> list=new ArrayList(Arrays.asList(car,pet,health));
		
		for(Insurance test:list) {
			test.cancelInsurance();
			test.getQuote();
		}
		Iterator<Insurance>it=list.iterator();
		while(it.hasNext()) {
			Insurance obj=it.next();
			System.out.println(obj.insuranceName);
		}
		
		for(int i=0;i<list.size();i++) {
			Insurance obj1=list.get(i);
		obj1.getQuote();
		
			
		}
	}

}
