package com.qa.testcases;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage login;
	
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		initialization();
		login = new LoginPage();
	}
	@Test
	public void Login()
	{
		login.SetUsername(prop.getProperty("username"));
		login.SetPassword(prop.getProperty("password"));
		login.ClickLoginBtn();
	}
	
	@AfterMethod
	public void Teardown()
	{
		driver.close();
	}

}
