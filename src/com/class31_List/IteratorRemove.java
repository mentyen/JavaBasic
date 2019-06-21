package com.class31_List;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorRemove {
	public static void main(String[] args) {
		ArrayList alist=new ArrayList();
		for(int i=1;i<=44;i++) {
			alist.add(i);
		}
		System.out.println(alist);
		
		Iterator<Integer> a=alist.iterator();
		while(a.hasNext()) {
			if(!(a.next()%2==0)) {
				a.remove();
			}
		}
		System.out.println(alist);
	}

}
