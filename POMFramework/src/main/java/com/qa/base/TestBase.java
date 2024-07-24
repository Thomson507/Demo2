package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/qa/config/Config.properties");
			try {
				prop.load(fip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		
	  
      driver.get(prop.getProperty("baseURL"));
  }
}
