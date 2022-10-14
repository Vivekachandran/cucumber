package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.helper.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("To Open Chrome Browser")
	public void to_Open_Chrome_Browser() throws InterruptedException {
	    
		BrowserLaunch();
		MaximizeWindow();
		Url("https://www.facebook.com/");
		
	}
	@When("To Pass username and password")
	public void to_Pass_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("kavi");
	    driver.findElement(By.id("pass")).sendKeys("12344");
	    driver.findElement(By.name("login")).click();
	}
	
	
	
	
	@Then("To Close Chrome Browser")
	public void to_Close_Chrome_Browser() {
		close();
	   
	}
   
	
	
	
	@When("To Click Create New Button ")
	public void to_Click_Create_New_Button_and_pass_all_data() {
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		
	   
	}

	@Then("To Click Signin Button")
	public void to_Click_Signin_Button() {
	    
	}



	
	
		

	    
}
