package com.Framework_dev.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig()
	{
		File filepath = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(filepath);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is :"+e.getMessage());
		}
	}
	
	public String getBaseUrl()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getUserName()
	{
		String uname = pro.getProperty("username");
		return uname;
	}
	public String getPassWord()
	{
		String pwd = pro.getProperty("password");
		return pwd;
	}
	public String getEdgepath()
	{
		String epath = pro.getProperty("edgepath");
		return epath;
	}
	public String getFireFoxpath()
	{
		String fpath = pro.getProperty("firefroxpath");
		return fpath;
	}

}
