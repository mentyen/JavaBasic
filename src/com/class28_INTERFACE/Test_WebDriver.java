package com.class28_INTERFACE;

public class Test_WebDriver {
	public Test_WebDriver() {
		
	}
	public static void main(String[] args) {
		ChromeDriver obj=new ChromeDriver();
		obj.closeBrowser();
		obj.findElement();
		obj.maximizeWindow();
		obj.openBrowser();
		obj.Execute();
		obj.getReport();
		obj.m2();
		TakeScreenshot.m1();
		System.out.println(TakeScreenshot.fileExtension);
	}

}
