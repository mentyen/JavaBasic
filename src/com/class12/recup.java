package com.class12;

public class recup {
	public static void main(String[] args) {
		int[][]arr= {
				{1,2,3},
				{10,20,30},
				{100,200,300}
				
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		//     singleArr=i[0]arr
		for(int[]singleArray:arr) {
			//for  numbers run all elements in first array
			for(int numbers:singleArray) {//1,2,3
				System.out.println(numbers+" ");
			}
			System.out.println();
		}
				
	}

}
