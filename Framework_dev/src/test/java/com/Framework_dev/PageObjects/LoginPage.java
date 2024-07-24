package com.Framework_dev.PageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
 public	LoginPage (WebDriver Wdriver)
	{
		driver =  Wdriver;
		PageFactory.initElements(Wdriver,this);
		
	}
	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup
	WebElement Username ;
	
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement Password ;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	@CacheLookup
	WebElement Login_btn ;
	
	public void SetUsername(String name)
	{  
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Username));
		Username.sendKeys(name);
	}
	public void SetPassword(String pword)
	{
		Password.sendKeys(pword);
	}
	public void ClickLoginBtn()
	{
		Login_btn.click();
	}

}
