package com.class11;

public class ForeachLoop {
	public static void main(String[] args) {
		/*
		int[]numbers= {12,13,14,15,16,17};
		for(int print:numbers)System.out.println(print+"\t");
		
		String[]cars= {"audi","bmw","volvo","mercedes","nissan","gm"};
		for(String print:cars)System.out.print(print+"\t");
		for(int i=0;i<cars.length;i++)System.out.println(cars[i]);
		
		String[]country= {"Russia","Usa"};
		for(int i=0;i<country.length;i++) {
						
			if(country[i].equalsIgnoreCase("Usa")) {
				System.out.println("Capital is Washington");
			}
			if(country[i].equalsIgnoreCase("Russia")) {
				System.out.println("Capital is Moscow");
			}
			
			
		}
		
		int[]num={12,23,24,56,78,99,109};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			
		}
		
			System.out.println(sum);
			
			for(int print:num) {
				sum=sum+print;
				
			}
			System.out.println(sum);
			
			
			
			String[]country2= {"Russia","USA"};
			for(int i=0;i<country2.length;i++) {	
				
				switch (country2[i]) {
				case "Russia":
					System.out.println("Mosc");
					break;
				case "USA":
					System.out.println("WashDC");
					break;
				}
				*/
				int[] numb= {12,23,134,12,-123,23,4,-5};
				//int max=numb[0];
				//int secMax=numb[0];
				int max=Integer.MIN_VALUE;
				int secMax=Integer.MIN_VALUE;
				
				for(int b=0;b<numb.length;b++) {
					if(numb[b]>max) {
						secMax=max;
						max=numb[b];
					}
					/*
					if(numb[b]>secMax&&numb[b]<max) {
						secMax=numb[b];
					}
					*/
				}
				System.out.println(max);
				System.out.println(secMax);
			
			
			}
			
	}


