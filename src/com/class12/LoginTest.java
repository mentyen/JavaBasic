package com.class12;

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		// user name or password is empty "It cant be empty"
		//Password should be longer then 8 and contain numbers
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your user name:");
		String userName=input.nextLine();
		System.out.println("Enter your password:");
		String password=input.nextLine();
		System.out.println("Reenter your password:");
		String confPassword=input.nextLine();
			
	
	if(!(userName.isEmpty() || password.isEmpty())) {
		
		if(password.length()>=8) {
			
			if(password.contains(userName)) {
				System.out.println("Password can not contain Username");
			}
			 else if(password.equals(confPassword)){
				System.out.println("Your username and pass has been created");
								
			}
			else System.out.println("Passwords do not match");
					
		}
		else System.out.println("Password is to short");
		
	}
	else System.out.println("Password and Username can not be empty");
	}

}
