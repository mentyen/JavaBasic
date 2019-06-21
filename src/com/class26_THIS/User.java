package com.class26_THIS;

public class User {
  String name,number;
  User(String name,String number){
	  this.name=name;
	  this.number=number;
  }
  public static void main(String[] args) {
	UserInfo obj=new UserInfo("43 main street,Queens NY","Vova","202333456");
	obj.call();
}

}
class UserInfo extends User{
	String address;
	public UserInfo(String address,String n,String p) {
		super(n,p);
		this.address=address;
	}
	
	public void call() {
		System.out.println(name+" "+number+" "+address);
	}
	
}