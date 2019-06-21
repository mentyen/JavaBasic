package pack1;

public class ChildA extends Child2{
	
	public static void main(String[] args) {
		ChildA obj=new ChildA();
		
		staticName="newNAme";
	
	}

}
class B extends ChildA{
	public static void main(String[] args) {
		System.out.println(staticName);
	}
}