package com.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;  // this is equal to "this.driver = driver;"
	
	public AbstractPage(WebDriver driver) {  // gets the instance of the driver from LandingPage constructor
		this.driver = driver;                
	}
	
	
	// the return type is landing page that means this method returns an instance of the LandingPage class
	public LandingPage navigateToWebApp(){ 
		
		driver.navigate().to("http://thetestroom.com/webapp/");
		return new LandingPage(driver);   //in return we can get access of driver here.
		 
	}
	
	public void closeDriver() {
		driver.quit();  // the reason we put this method here is we can quit driver from any class as every class is inheriting 
	}                   // Abstract class

}
