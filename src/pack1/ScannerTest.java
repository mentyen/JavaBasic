package pack1;

import java.util.Arrays;

public class ScannerTest {
	public static void main(String[] args) {
		int a=10;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		
		String name="vova";
		String name2="bob";
		name=name+name2;
		
		name2=name.substring(0, (name.length()-name2.length()));
		System.out.println(name2);
		name=name.substring(name2.length());
		System.out.println(name);
		
		int[]num= {12,22,334,4,5,67,-1,0};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
		int max=0;
		int secMax=0;
		for(Integer run:num) {
			if(run>max) {
			   secMax=max;
				max=run;
				
			}
			if(run>secMax && run<max) {
				secMax=run;
			}
			
		}
	System.out.println(secMax);
	
	
	String az="akjsufifoe392k+++fjvs@#,";
	System.out.println(az.length());
	String realA=az.replaceAll("[^A-Za-z]","");
	System.out.println(realA.length());
	
	String bz=az.replaceAll("[^A_Za-z]", "");
	
	String nameTask="Hello world we are here.";
	System.out.println(nameTask.substring(12));
	
	String[]numberOfWords=nameTask.split("");
	System.out.println(numberOfWords.length);
	
	String rev="";
		for(int i=nameTask.length()-1;i>=0;i--) {
			rev+=nameTask.charAt(i);
		}
		
		System.out.println(rev);
	
	String name3="Reverce me by chars";
	char[]array=name3.toCharArray();
	String nameR="";
	
	for(int i=array.length-1;i>=0;i--) {
		nameR+=array[i];
	}
	System.out.println(nameR);

	}
}
