package com.qa.testcases;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.LoginPage;

public class Dashboardpage extends TestBase{
    Dashboard dashboard;
    LoginPage login;
   
    
    public Dashboardpage()
    {
    	super();
    }
    @BeforeMethod
    public void Setup()
    {
    	initialization();
       login = new LoginPage();
 	   login.SetUsername(prop.getProperty("username"));
 	   login.SetPassword(prop.getProperty("password"));
 	   login.ClickLoginBtn();
    	dashboard = new Dashboard();
    }
    
   @Test(priority=1)
   public void Dashboard_init()
   {
	   dashboard.Verify_Dasboard();
   }
   @Test(priority = 2)
   public void Dashboard_Elem()
   {
	  
	   dashboard.Verify_Dashboard_elements();
   }
   @AfterMethod
   public void Teardown()
   {
	   driver.close();
   }
}
