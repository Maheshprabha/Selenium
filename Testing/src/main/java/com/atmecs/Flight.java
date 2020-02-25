package com.atmecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flight {
	@Test
	public void Booking() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh.Pethannan\\eclipse-workspace\\Selenium\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		
		
		
	}
{
	
}
}
