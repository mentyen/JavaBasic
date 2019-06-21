package pack1;

public class Test extends Main {
	Test(){
		super(323,"Child Constructor");
	}

	
	public static void main(String[] args) {
		Test obj=new Test();
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(nameS);
	}

}
