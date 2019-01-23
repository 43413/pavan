package com.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc01 {

	@Given ("launch the chrome browser and pass the url")
	public static void launchthechromebrowserandpasstheurl() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@When("Browser is launched , click on signin")
	public static void browserislanchedclickonsignin() {
		RemoteWebDriver driver = null;
		driver.findElement(By.xpath("//*[@class='login']")).click();
	}
	
	@Then ("enter valid email Id in email address field")
	public static void entervalidemailidinemailaddressfield() {
		
	}
		@FindBy(how = How.XPATH,using="//input[@name='email_create']")	
  		public static WebElement Eamil_Field_Element;
		private static WebElement valid_email_address;
		private static WebElement Email_Field_Element;
		private static WebElement Btn_CreateAccount;
		private static WebDriver driver;
		public static void Verify_Invalid_Email_Error(String emailId){
			  
			  //enter invalid email address 
			  
			  Email_Field_Element.click();
			  Email_Field_Element.sendKeys("abcd.ab.com");
			  
			  //click on create account button
			  Btn_CreateAccount.click();
			  
			  //waiting for 10 seconds after clicking button to let the page loaded and display message
			  new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(valid_email_address));
	}
}
