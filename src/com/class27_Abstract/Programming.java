package com.class27_Abstract;

public abstract class Programming {
	
	public abstract void writeCode();//implementation is hidden and can only been see in Inherited child class
	public abstract void debug();
	
	public void understand_Logic() {
		System.out.println("Must understand logic");
	}
	
	public void know_syntax() {
		System.out.println("Must understand syntax");
	}
	
	
}
class Java extends Programming{
	public  void writeCode() {
		System.out.println("You must download IDE were you will cod");
	}

	@Override
	public void debug() {
	
		System.out.println("In java debug we use Eclipse IDE");
		
	}
	
}

class Csharp extends Programming{
	public  void writeCode() {
		System.out.println("You must download VisualStudio were you will cod");
	}

	@Override
	public void debug() {
		System.out.println("In C# to do debug you need to use Visial Studio");
		
	}
}