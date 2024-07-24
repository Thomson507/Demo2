package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.PIMPage;

public class PIMPageTest extends TestBase{
		PIMPage PIM;
		LoginPage login;
		
		public PIMPageTest() {
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
			PIM = new PIMPage();
		}
	@Test
	public void PIM_init()
	{
		PIM.ClickPIM();
		String empname = PIM.SetEMployeeName("Thomson");
		System.out.println("Employee Neame:"+empname);
		String empid = PIM.SetEmployeeID("EFAS1234");
		System.out.println("Employee ID :"+empid);
		String employeestat = PIM.SetEmpstatus("Full-Time Permanent");
		System.out.println("Employee Status:"+employeestat);
		String include = PIM.SetIncludedropdown("Current Employees Only");
		System.out.println("Include:"+include);
		String sname = PIM.SetSupervisor("Joju");
		System.out.println("SuperVisor Name:"+sname);
		String jobtitle = PIM.SetJobtitle("Automaton Tester");
		System.out.println("Job Title:"+jobtitle);
		String subunit = PIM.SetSubunit("Engineering");
		System.out.println("Subunit:"+subunit);
	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}
		
}
