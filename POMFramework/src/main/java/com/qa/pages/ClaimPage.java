package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utility.TestUtil;

public class ClaimPage extends TestBase{
	
       
	@FindBy(xpath = "//a/span[text()='Claim']")
	@CacheLookup
	WebElement Claim;
	
	@FindBy(xpath = "(//nav[@role=\"navigation\"])[2]/ul/li[3]")
	@CacheLookup
	WebElement Myclaim;
	
	@FindBy(xpath = "//div[@class=\"oxd-autocomplete-wrapper\"]/div/input")
	@CacheLookup
	WebElement Refernceid;
	
	@FindBy(xpath = "(//div[@class=\"oxd-select-text--after\"])[1]")
	@CacheLookup
	WebElement EventnameDrop;
	
	By Eventanamelist = By.xpath("(//div[@class=\"oxd-select-wrapper\"])[1]/div[2]");
	
	@FindBy(xpath ="(//div[@class=\"oxd-select-text--after\"])[2]")
	@CacheLookup
	WebElement Status;
	
	By Statuslist = By.xpath("(//div[@class=\"oxd-select-wrapper\"])[2]/div[2]");
	
	@FindBy(xpath = "(//div[@class=\"oxd-date-wrapper\"])[1]/div/input")
	@CacheLookup
	WebElement Fromdate;
	
	@FindBy(xpath ="(//div[@class=\"oxd-date-wrapper\"])[2]/div/input")
	@CacheLookup
	WebElement Todate;
	
	public ClaimPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickClaim()
	{
		TestUtil.ExplicitWaitClickable(driver, Claim);
		Claim.click();
	}
	public void ClickMyclaim()
	{
		TestUtil.ExplicitWaitClickable(driver, Myclaim);
		Myclaim.click();
	}
	public String SetrefID(String Referid)
	{ 
		Refernceid.sendKeys(Referid);
		return Referid;
	}
	public String SetEvent(String EvenT)
	{
		EventnameDrop.click();
		List<WebElement> Eventlist = driver.findElements(Eventanamelist);
		 for (int i = 0; i < Eventlist.size(); i++) {
			if (Eventlist.contains(EvenT))
				driver.findElement(Eventanamelist).click(); 
	}
		return EvenT;
}
	public String SetStatus(String StatuS)
	{
		Status.click();
		List<WebElement> Stalist = driver.findElements(Statuslist);
		 for (int i = 0; i < Stalist.size(); i++) {
			if (Stalist.contains(StatuS))
				driver.findElement(Statuslist).click(); 
	}
		return StatuS;
}
	public String SetFromdate(String fromdate)
	{
		Fromdate.click();
		Fromdate.sendKeys(fromdate);
		return fromdate;
	}
	public String Settodate(String todate)
	{
		Todate.click();
		Todate.sendKeys(todate);
		return todate;
		
	}
}