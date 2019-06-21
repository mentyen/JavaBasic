package com.class32_Set;

import java.util.Arrays;
import java.util.HashSet;
@SuppressWarnings("unchecked")
public class Main {
	static HashSet list;
	  public static void main(String[]args){
			Main m=new Main();
			HashSet list=new HashSet(Arrays.asList("first","second","third","fourth","fifth"));
			
			System.out.print("HashSet contains:"+list+" Array elements:");
			m.call(list);
			
	
	
		
		
		  }
	  public  void call(HashSet list) {
		  this.list=list;
			for(Object a:list) {
				System.out.print(a+" ");
			}
	  }

		}