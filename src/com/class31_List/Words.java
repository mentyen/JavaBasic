package com.class31_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Words {
	public static void main(String[] args) {
		ArrayList<String> word=new ArrayList(Arrays.asList("helle","earthe","world","javae","selenium"));
		
		Iterator<String>word1=word.iterator();
		while(word1.hasNext()) {
			String list=word1.next();
			if(list.endsWith("e")) {
				word1.remove();
			}
		}
		
		for(int i=0;i<word.size();i++) {
			if(word.get(i).endsWith("m")) {
				word.remove(i);
			}
		}
		
	
		System.out.println(word);
		
		
		ArrayList drinks=new ArrayList(Arrays.asList("tequila","Vodka","soda","juce"));
		
		for(int i=0;i<drinks.size();i++) {
		String y=(String) drinks.get(i);
		if(y.contains("a")||y.contains("e")) {
			drinks.set(i, "water");
		}
		}
		System.out.println(drinks);
		
		
		ArrayList num=new ArrayList();
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				num.add(i);
			}
		}
		
		for(int i=0;i<num.size();i++) {
			int x=(int) num.get(i);
			if(x%5==0) {
				num.remove(i);
			}
		}
		
		System.out.println(num);


		
		
	}

}
