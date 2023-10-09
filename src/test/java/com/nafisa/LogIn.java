package com.nafisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogIn extends BaseDriver
{
	String url = "http://123.200.20.20:8005/";
	
	
	@Test
	public void OpenUrl() throws InterruptedException
	{
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000); //1000ms = 1s
		
		//username
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).click();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
		username.sendKeys("100011");
		
		//password
		driver.findElement(By.xpath("//input[@id='exampleInputPassword2']")).click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='exampleInputPassword2']"));
		password.sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/a[1]/i[1]")).click();
		Thread.sleep(5000);
		
		
		//login button
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(10000);
		//login.click();
	}
}
