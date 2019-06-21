package pack1;

import java.util.Map;

public abstract class Abstr1 {
	
	public abstract void call();
	public abstract void drive();
	public abstract void call(int num);
	

}
class car extends Abstr1{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("this is a new car");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call(int num) {
		// TODO Auto-generated method stub
		System.out.println("I would by a:" +num+ " of this cars");
	}
	
	public Integer carCount(int num){
		int count=num+3;
		return count;
	}
	public static void main(String[] args) {
		car obj=new car();
		obj.call(3);
		
	}
}