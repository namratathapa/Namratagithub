package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart_TestNg {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void openbrowser () {		
	
		
	driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//*[@class='_30XB9F']")).click();
	}
	
	@Test
	public void Searchitem() {
		
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("phone");
	
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	
		
	
	}
	
	@AfterMethod
	
	public void Browserclose() {
		
		driver.close();
	}

}
