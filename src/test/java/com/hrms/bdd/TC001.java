package com.hrms.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC001 {
	
	public WebDriver driver;
	@Given("^open application$")
	public void openbrowser() {
		
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Application Opend sucessfully");
		
	}
	@When("^Verify title$")
	public void verify_title() {
		
		if(driver.getTitle().equals("Snap deal")) {
			
			
			System.out.println("Title verified");
		}
		else {
			
			System.out.println(driver.getTitle());
			
		}
		
		
	}
	
	@Then("^Close Application$")
	public void closeapp() {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
