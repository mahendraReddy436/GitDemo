package com.First;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class googleTest {
	@Test
	public void homePageCheck() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
	
		WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.1.5:4444"),caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("q")).sendKeys("Sachin");
		
	}
	

}
