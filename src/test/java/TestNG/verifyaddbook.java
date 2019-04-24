package TestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class verifyaddbook {
	WebDriver driver;
	  @BeforeMethod
	  public void launch() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://35.237.9.241:32769/addressbook/"); 
	  }
	@Test
  public void addbook() {
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Neelesh1");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Shrivastava");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("4585675324");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@gmil.com");
		driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
		
  }
	@AfterMethod
	  public void close() {
		  //driver.close();
	  } 
}
