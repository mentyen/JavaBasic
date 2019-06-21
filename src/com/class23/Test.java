package com.class23;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println("----Creating Employee object");
		Employee emp=new Employee();
		System.out.println(Employee.department);
		Employee.work();
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("-----Creating a ScrumTeam object");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog,Burndown chart";
		st.ceremonies="Sprint grooming,Sprint planning(Users storyes ,by Fib numbers, if its to large it will brake to smalle one),Daily standUps,Sprint Demo(review),Sprint retro(walk thrue all issues of this sprint)";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("-----Creating a Developer object");
		Developer dev=new Developer();
		dev.salary=120000;
		Developer.work();
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Grooming,Planing,Daily Stendups,Demo,Retrospect";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("-----Creating a Tester object");
		Tester qa=new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprint backlog";
		qa.ceremonies="Grooming,Planing,Daily Stendups,Demo,Retrospect";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		System.out.println("-----Creating a BusinessAnalyst object");
		BussinessAnalyst ba=new BussinessAnalyst();
		ba.salary=90000;
		ba.getPaid();
		ba.artifacts="Sprint backlog";
		ba.ceremonies="Grooming,Planing,Daily Stendups,Demo,Retrospect";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("-----Creating a BusinessAnalyst object");
		ScrumMaster sm=new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burndown charts";
		sm.ceremonies="Grooming,Planing,Daily Stendups,Demo,Retrospect";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("-----Creating a BusinessAnalyst object");
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprint backlog,Product Backlog";
		po.ceremonies="Sprint grooming,Sprint planing, Sprint demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		
		System.out.println("----Creating a FrontEnd object");
		FrontEnd fe=new FrontEnd();
		fe.salary=120000;
		fe.getPaid();
		fe.artifacts="Sprint Backlog";
		fe.ceremonies="Grooming, Planing,Stendup,Demo,Retro";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.code();
		fe.doHtml();
		
		System.out.println("----Creating a BackEnd object");
		BackEnd be=new BackEnd();
		be.salary=120000;
		be.getPaid();
		be.artifacts="Sprint Backlog";
		be.ceremonies="Grooming, Planing,Stendup,Demo,Retro";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.code();
		be.doSql();
		
		System.out.println("-----Creating a Manual object");
		Manual qam=new Manual();
		qam.salary=100000;
		qam.getPaid();
		qam.artifacts="Sprint backlog";
		qam.ceremonies="Grooming,Planing,Daily Stendups,Demo,Retrospect";
		qam.workOnArtifacts();
		qam.attendScrumMeetings();
		qam.test();
		qam.testManualy();
		
		System.out.println("-----Creating a Automation object");
		Automation qaa=new Automation();
		qaa.salary=100000;
		qaa.getPaid();
		qaa.artifacts="Sprint backlog";
		qaa.ceremonies="Grooming,Planing,Daily Stendups,Demo,Retrospect";
		qaa.workOnArtifacts();
		qaa.attendScrumMeetings();
		qaa.test();
		qaa.codeInJava();
		
		
		
	}
}
