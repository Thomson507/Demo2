package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ClaimPage;
import com.qa.pages.LoginPage;
import com.qa.utility.TestUtil;



public class ClaimPageTest extends TestBase{
        ClaimPage claim;
        LoginPage login;
        String Sheetname= "Myclaims";
        
        public ClaimPageTest()
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
    	 claim= new ClaimPage();
     }
     
     @DataProvider
     public Object[][] getClaimdata(){
     
    	 Object data[][]= TestUtil.getTestData(Sheetname);
		return data; 
     }
     
     @Test
     public void Claims()
     {
    	 claim.ClickClaim();
    	 claim.ClickMyclaim();
     }
     
     @Test(dataProvider = "getClaimdata",priority = 2)
     public void Claim_init(String ReferenceID, String Eventname,String Status, String Fdate, String Tdate)
     {
    	
    	 claim.SetrefID(ReferenceID);
    	 claim.SetEvent(Eventname);
    	 claim.SetStatus(Status);
    	 claim.SetFromdate(Fdate);
    	 claim.Settodate(Tdate);
     }
     @AfterMethod
     public void Teardown()
     {
    	 driver.quit();
     }
}
