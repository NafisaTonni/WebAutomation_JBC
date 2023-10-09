package com.nafisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver 
{
	WebDriver driver;
	
	public void StartBrowser()
	{
		String BrowserName = System.getProperty("browser" , "Chrome");
		
		if(BrowserName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
	
	public void close()
	{
		driver.close();
	}
}
