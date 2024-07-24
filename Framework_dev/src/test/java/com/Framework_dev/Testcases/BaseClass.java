package com.Framework_dev.Testcases;


import java.util.logging.Logger;

import org.apache.*;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Framework_dev.Utilities.ReadConfig;



public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String BaseUrl= readconfig.getBaseUrl();
	public String UserName = readconfig.getUserName();
	public String Password = readconfig.getPassWord();
	
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void SetupMethod(String br)
	{
		//Logger logger = Logger.getLogger("Framework_Logs");
//		propertyC
		if (br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",readconfig.getEdgepath());
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFireFoxpath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.get(BaseUrl);
		
	
	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}

}
