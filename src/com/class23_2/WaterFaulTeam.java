package com.class23_2;

import com.class23.Employee;

public class WaterFaulTeam extends Employee {
	public static void main(String[] args) {
		WaterFaulTeam wt=new WaterFaulTeam();
		wt.salary1=90000;// protected and public can be access thru inheritance from a different package
		//wt.salary=50000;---default values can not be access in different package
		wt.test();//Available its protected
		//wt.test1(); --not available course its default
	}

}
