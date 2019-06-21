package com.class17_2;

import com.class17Method.Calculator;

public class Application {
	   void example() {
	        System.out.println("No value no Parameter");
	    }

	    void example2(String name) {

	        System.out.println("Return "+name);
	    }

	    boolean example3() {

	        System.out.println("With return value and NO Parameters");
	        return true;
	    }

	    String example4(String name) {

	        System.out.println("No return value but with Parameter :"+name);
	        
	        return name;
	    }
	    
	    
	    boolean example5(String name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return false;
	    }
	    
	    
	    long example6(char name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return name;
	    }
   public static void main(String[] args) {
	   Application x=new Application();
	   x.example();
	Calculator num=new Calculator();
	num.sum(1,2);
	num.div(3, 6);
	num.sub();
	System.out.println(num.mult(4,8));
	
}
}
