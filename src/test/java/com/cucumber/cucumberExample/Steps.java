package com.cucumber.cucumberExample;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.PageObjects.ContactConfirmPage;
import com.cucumber.PageObjects.ContactPage;
import com.cucumber.PageObjects.LandingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver = new FirefoxDriver();
	 LandingPage landingPage; 
	 ContactPage contactPage; 
	 ContactConfirmPage contactConfirmPage;
	 
	 
	
	
	@Given("^I am on the zoo site$")
	public void I_am_on_the_zoo_site() throws Throwable {
        landingPage = new LandingPage(driver);
	    landingPage.navigateToWebApp();
	    
	    
	}

	@When("^I click on \"([^\"]*)\"$")
	public void I_click_on(String link) throws Throwable {
		contactPage = landingPage.navigateToContactPage(link);
	    
	}

	@When("^I enter \"([^\"]*)\" into the name field$")
	public void I_enter_into_the_name_field(String value) throws Throwable {
		contactPage.setNameField(value);
	    
	}

	@When("^I enter \"([^\"]*)\" into the Address field$")
	public void I_enter_into_the_Address_field(String value) throws Throwable {
	  
		contactPage.setAddressField(value);
	}

	@When("^I enter \"([^\"]*)\" into the Postcode field$")
	public void I_enter_into_the_Postcode_field(String value) throws Throwable {
	    
		contactPage.setPostCodeFieldField(value);
	}

	@When("^I enter \"([^\"]*)\" into the Email field$")
	public void I_enter_into_the_Email_field(String value) throws Throwable {
		
		contactPage.setEmailField(value);
	  
	}

	@When("^I submit the contact form$")
	public void I_submit_the_contact_form() throws Throwable {
		contactConfirmPage = contactPage.submitForm();
	}

	@Then("^I check I am on the confirmation page$")
	public void I_check_I_am_on_the_confirmation_page() throws Throwable {
		//Assert.assertTrue(driver.findElement(By.cssSelector(".content h1")).getText().contains("We have your message"));
	   Assert.assertTrue(contactConfirmPage.getPageTitle().contains("We have your message"));
	}

	@Then("^I close the browser$")
	public void I_close_the_browser() throws Throwable {
		//driver.quit();
		
		contactConfirmPage.closeDriver();
	    
	}

}
