package com.atmecs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yatra {
	@Test
	public void Travel() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahesh.Pethannan\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	}
		//@SuppressWarnings("null")
		public void Scroll(JavascriptExecutor JavascriptExecutor) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor);
		jse.executeScript("window.scrollBy(0,20000)");
		Thread.sleep(50000);
		//jse.executeScript("window.scrollTo(0,-20000)");

		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,-20000)");
		
	}
}
