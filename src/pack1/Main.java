package pack1;

public class Main {
	private String name;
	private int age;
	static String nameS="Static";
	
	public Main() {
		System.out.println("No parametrize constructor");
	}
	public Main(String a) {
		
		System.out.println(a);
	}
	
	public Main(int age,String name) {
		this();
		this.setName(name);
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		
	}
	

	public void print() {
		String name="Murzik";
		System.out.println(name);
}
	public static void main(String[]args) {
		Main obj1=new Main(22,"vova");
		Main obj=new Main("Second constr");
		System.out.println(obj.getName());
		System.out.println(obj.age);
		obj.print();
		System.out.println(nameS);
		nameS="local";
		System.out.println(nameS);
		
		System.out.println(obj.getName());
		
		X x=new X();
		System.out.println(x.i);
		x.methodOfX();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
