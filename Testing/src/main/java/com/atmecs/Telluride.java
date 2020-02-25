package com.atmecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Telluride {
	WebDriver driver;

	@Test
	public void Travel() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahesh.Pethannan\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='current day']")).sendKeys("12feb2019");
		
		
		}
	/*public void SelectDayFromMultiDateCalendar(String day) throws InterruptedException {
		By calendarXpath = By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + day + "']");
		driver.findElement(calendarXpath).click();
		Thread.sleep(2000);*/

	
	

}
