package com.class28_INTERFACE;

public interface WebDriver extends TakeScreenshot,Execute {

void closeBrowser();
void maximizeWindow();
void findElement();
}
class ChromeDriver extends Browser implements WebDriver,Report{

	@Override
	public void openBrowser() {
		System.out.println("Open browser Crome");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close browser Crome");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("zoom ");
		
	}

	@Override
	public void findElement() {
		System.out.println("Search in browser ");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report from Crom browser");
		
	}

	@Override
	public void TakeScreenshot() {
		System.out.println("Taking a screenshot of the page");
		
	}

	@Override
	public void Execute() {
		System.out.println("execute");
		
	}
	
}
class FireFoxDriver extends Browser implements WebDriver,Report{

	@Override
	public void openBrowser() {
		System.out.println("Open browser Fox");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close browser Fox");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("zoom ");
		
	}

	@Override
	public void findElement() {
		System.out.println("Search in browser ");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report from Firefox");
		
	}

	@Override
	public void TakeScreenshot() {
		System.out.println("Taking a screenshot of a Fox page");
		
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		
	}
	
}
