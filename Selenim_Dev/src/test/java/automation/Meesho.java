package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class Meesho {

	public static void main(String[] args) {
		
	/*WebDriver driver;
driver = new FirefoxDriver();
driver.get("https://www.flipkart.com");
//
WebElement shopping=
driver.findElement (By.xpath("//*[@class='Pke_EE']"));
shopping.sendKeys("Saree");
shopping.sendKeys(Keys.ENTER);*/
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	WebElement search=
	driver.findElement(By.id("input"));
	search.sendKeys("manual teating");
	search.sendKeys(Keys.ENTER);
	


	}

}
