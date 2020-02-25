import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practical {
	@Test
	public void php() {

		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mahesh.Pethannan\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://10.10.10.232:8080/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@href='/register']")).click();
			driver.findElement(By.xpath("//input[@id='customer.emailAddress']")).sendKeys("maheshprabha@980455.com");
			driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("mahesh");
			driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("prabha");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
			driver.findElement(By.xpath("//input[@id='passwordConfirm']")).sendKeys("12345678");
			driver.findElement(By.xpath("//input[@class='register_button big red']")).click();
			driver.findElement(By.xpath("//a[@href='/hot-sauces']")).click();
			driver.findElement(By.xpath("//div[@class='productActions productActions3'][1]")).click();
			driver.findElement(By.xpath("//*[@id=\"products\"]/li[3]/div[3]/div[2]/form/input[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"cartLink\"]/span[4]")).click();
			// driver.findElement(By.xpath("//*[@id=\"cartLink\"]")).click();
			driver.findElement(By.xpath("//a[@href='/checkout']")).click();
			// driver.findElement(By.xpath("//*[@id=\"cartLink\"]/img"));
			driver.findElement(By.className("['address.firstName']")).sendKeys("mahesh");
			driver.findElement(By.xpath("//*[@id=\"address.lastName\"]")).sendKeys("jdksdj");
			driver.findElement(By.xpath("//input[@id='address.phonePrimary'][1]")).sendKeys("9856234578");
			driver.findElement(By.xpath("//input[@id='address.addressLine1'][1]")).sendKeys("Abc Street");
			driver.findElement(By.xpath("//input[@id='address.addressLine2']"));
			driver.findElement(By.xpath("//input[@id='address.postalCode']")).sendKeys("123456");
			driver.findElement(By.xpath("")).sendKeys("");
			//driver.findElement(By.xpath("")).sendKeys("");
			//driver.findElement(By.xpath("")).sendKeys("");
			//driver.findElement(By.xpath(""));
			//driver.findElement(By.xpath(""));
			
			
			driver.close();

		}
	}
}
