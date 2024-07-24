package com.Framework_dev.Testcases;

import org.testng.annotations.Test;
import com.Framework_dev.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void LoginTesting()
	{
		
		
		LoginPage lp= new LoginPage(driver);
		lp.SetUsername(UserName);
		lp.SetPassword(Password);
		
		lp.ClickLoginBtn();
		
	}

}
