package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends AbstractPage{
 
	public LandingPage(WebDriver driver) {  // if we create a landing page and pass in the instance of the driver 
		super(driver);  // it will call the super driver that means it will pass the same instance of the driver to the AbstractPage constructor  
		
	}
	
	public ContactPage navigateToContactPage(String link) {
		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
		return new ContactPage (driver);
	}

	

}
