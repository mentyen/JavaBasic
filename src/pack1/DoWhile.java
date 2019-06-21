package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DoWhile {
	
	public String name="a";
	public static String nameStatic="a";
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(23,23,4,5,6,7,855,66,855));
		HashSet set=new HashSet(list);
		System.out.println(set);
		
		HashSet<String>set1=new HashSet();
		
		set1.add("one");
		set1.add("two");
		
		
		int x,y,sum;
		x=1;
		y=1;
		sum=x+y;
		x=y;y=sum;
		
		x=37;
		boolean flag=true;
		for(int i=2;i<x;i++) {
			if(x%i!=0) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
		
		
		/*
		
		String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";
		
		
		given=given.substring(0, 5);
		System.out.println(given);
		String new1=given.replaceAll("[A-Z,a-z]", "");
		System.out.println(given.length());
		System.out.println(new1);
		System.out.println(new1.length());
		
		
		String text="Hello World";
		String reverce="";
		
		StringBuffer rev=new StringBuffer(text);
		rev.reverse();
		System.out.println(rev);
		
		char[]array=text.toCharArray();
		String revChar="";
		for(int i=array.length-1;i>=0;i--) {
			revChar+=array[i];
		}
		System.out.println(revChar);
		 text="maam maama";
		String[]arrayString=text.split("");
		String revStringArray="";
		for(int i=arrayString.length-1;i>=0;i--) {
			revStringArray+=arrayString[i];
		}
		
		System.out.println(revStringArray);
		
		if(revStringArray.equals(text)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not");
		}
		
		for(int i=text.length()-1;i>=0;i--) {
			reverce+=text.charAt(i);
		}
		
		System.out.println(reverce);
	
		int[]list= {23,33,4,55,6,777,8,0};
		
		Arrays.sort(list);
	System.out.println(list[list.length-2]);
	System.out.println(list[0]);
		
		int larg=0;
		int seclarg=0;
		
		for(int num:list) {
			if(num>larg) {
				seclarg=larg;
				larg=num;
			}
			
			if(num>seclarg&&num<larg) {
				seclarg=num;
			}
		}
		
		System.out.println(larg);
	*/
	}
}
