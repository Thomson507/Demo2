package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.utility.TestUtil;

public class Dashboard extends TestBase{
	
	@FindBy(xpath = "//a/span[text()='Dashboard']")
	WebElement Dashboard;
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement Dashboardtext;
	
	By Dashboardelements = By.xpath("//h6[text()='Dashboard']");
	
	public Dashboard()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean Verify_Dasboard()
	{
		TestUtil.ExplicitWaitVisiblity(driver, Dashboard);
		Dashboard.click();
		TestUtil.ExplicitWaitVisiblity(driver, Dashboardtext);
		String Dboardtext = Dashboardtext.getText();
		Assert.assertEquals(Dboardtext, "Dashboard");
		return false;
	}
	public boolean Verify_Dashboard_elements()
	{
		List<WebElement> D_elements = driver.findElements(Dashboardelements);
		for (WebElement webElement : D_elements) {
			//webElement.isDisplayed();
			System.out.println(webElement.getText());
		}
		return false;
	}
}
