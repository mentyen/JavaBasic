package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Child2{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String staticName="StaticName";
	
        public static void main(String[] args) {
        	
        Child2 obj=new Child2();
        obj.setName("localName");
        System.out.println(obj.getName());     
        	
	
}
        	
  public ArrayList<String> list(List<String> name) {
	  ArrayList<String>list=new ArrayList(Arrays.asList(name));
	  Iterator<String>it=list.iterator();
	  while(it.hasNext()) {
		  it.hasNext();
		 
	  }
	return list;
  }
        	
        
}
