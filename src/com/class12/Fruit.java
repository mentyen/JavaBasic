package com.class12;

public class Fruit {
public static void main(String[] args) {
	String[][]a= {
			{"fruits","kiwi","banana","apple"},
			{"veggies","pumpkin","tomato","cucumber"},
			{"dairy","I dont eat or drink dairy product"}
	};
	for(String[]firstArr:a) {
		for(String name:firstArr) {
			System.out.print(name+" ,");
		}
		System.out.println();
	}
	System.out.println();
	
	for (int i=0;i<a.length;i++) {
		for(int b=0;b<a[i].length;b++) {
			System.out.print(a[i][b]+" ,");
		}
		System.out.println();
	}
}
}
