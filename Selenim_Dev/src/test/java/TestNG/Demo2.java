package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	
WebDriver driver;
	
	@BeforeMethod
	public void ForAll() {
		driver= new FirefoxDriver();
	System.out.println("this method run before all test");
	
	}
	@AfterMethod
	public void ForEnd() {
		System.out.println("this method run after all test");
		driver.close();
		}
	@Test(priority=1)
	public void abc() {
	System.out.println("This is my third TestNG programme");
	driver.get("https://www.flipkart.com/");
	}
	
	
	
	@Test(priority=2, enabled = false)
	public void aaa() {
		System.out.println("This is my fourth TestNG programme");
		driver.get("https://www.zara.com/in/");
		}
	


}
