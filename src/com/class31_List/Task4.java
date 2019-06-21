package com.class31_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList();
		for(int i=2;i<=50;i+=2) {
			list.add(i);
			}
		Iterator<Integer>num=list.iterator();
		while(num.hasNext()) {
			if(num.next()%5==0) {
				num.remove();
			}
		}
		System.out.println(list);
		}
	}


