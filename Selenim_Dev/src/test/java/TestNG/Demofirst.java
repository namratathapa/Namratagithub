package TestNG;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demofirst {
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
	public void adc() {
	System.out.println("This is my first TestNG programme");
	driver.get("https://www.amazon.in");
	}
	
	
	
	@Test(priority=2)
	public void aaa() {
		System.out.println("This is my Second TestNG programme");
		driver.get("https://www.google.com/");
		}
	

}
