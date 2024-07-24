package com.qa.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;
import com.qa.utility.TestUtil;

public class PIMPage extends TestBase{

	@FindBy(xpath = "//a/span[text()='PIM']")
	WebElement PIM;
	
	By Employeename = By.xpath("(//div[@class=\"oxd-autocomplete-wrapper\"]/div/input)[1]");
	
	 @FindBy(xpath = "//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]/div/div[2]/input")
	 WebElement EmployeeID;
	 
	 @FindBy(xpath = "(//div[@class=\"oxd-select-text--after\"])[1]")
	 WebElement EmployeestatdropDown;
	 
	 @FindBy(xpath = "(//div[@class=\"oxd-select-text--after\"])[2]")
	 WebElement Includedropdown;
	 
	 By EmployeeDroplist = By.xpath("(//div[@class=\"oxd-select-wrapper\"])[1]/div[2]");
	 
	 By Includedroplist = By.xpath("(//div[@class=\"oxd-select-wrapper\"])[2]/div[2]");
	 
	 By Supervisorname = By.xpath("(//div[@class=\"oxd-autocomplete-wrapper\"])[2]/div/input");
	 
	 @FindBy(xpath = "(//div[@class=\"oxd-select-text--after\"])[3]")
	 WebElement JobTitleropdown;
	 
	 By Jobtitlelist = By.xpath("(//div[@class=\"oxd-select-wrapper\"])[3]/div[2]");
	 
	 @FindBy(xpath = "(//div[@class=\"oxd-select-text--after\"])[4]")
	 WebElement SubUnitdropdown;
	 
	 By Subunitlist = By.xpath("(//div[@class=\"oxd-select-wrapper\"])[4]/div[2]");
	 
	 public PIMPage()
		{
			PageFactory.initElements(driver, this);
		}
	 public void ClickPIM()
	 {
		 TestUtil.ExplicitWaitClickable(driver, PIM);
		 PIM.click();
	 }
	 
	 public String  SetEMployeeName(String Ename)
	 {  
		 TestUtil.ExplicitWaitVisisblity2(driver, Employeename);
		 driver.findElement(Employeename).sendKeys(Ename);
		 return Ename;
	 }
	 public String SetEmployeeID(String EMpid)
	 {
	
		 EmployeeID.sendKeys(EMpid);
		 return EMpid;
	 }
	 public String SetEmpstatus (String EMPStat)
	 {
		 EmployeestatdropDown.click();
		 List<WebElement> Empstatlist = driver.findElements(EmployeeDroplist);
		 for (int i = 0; i < Empstatlist.size(); i++) {
			if (Empstatlist.contains(EMPStat))
				driver.findElement(EmployeeDroplist).click();
		}
		return EMPStat;
		}
	 
	 public String SetIncludedropdown(String Inlcudedrop)
	 {
		 Includedropdown.click();
		 List<WebElement> Includelist = driver.findElements(Includedroplist);
		 for (int i = 0; i < Includelist.size(); i++) {
			if (Includelist.contains(Inlcudedrop))
				driver.findElement(Includedroplist).click(); 
	 }
		return Inlcudedrop;
	 
	 }
	 public String SetSupervisor(String Sname)
	 {
		 driver.findElement(Supervisorname).sendKeys(Sname);
		 return Sname;
	 }
	 
	 public String SetJobtitle(String JobTitle)
	 {
		 JobTitleropdown.click();
		 List<WebElement> JTlist = driver.findElements(Jobtitlelist);
		 for (int i = 0; i < JTlist.size(); i++) {
			if (JTlist.contains(JobTitle))
				driver.findElement(Jobtitlelist).click();
				
		 }
		return JobTitle;
	 }
	 public String SetSubunit(String Sunit)
	 {
		 SubUnitdropdown.click();
		 List<WebElement> Slist = driver.findElements(Subunitlist);
		 for (int i = 0; i < Slist.size(); i++) {
			if (Slist.contains(Sunit))
				driver.findElement(Jobtitlelist).click();
		 }
		return Sunit;
	 }
}	 
