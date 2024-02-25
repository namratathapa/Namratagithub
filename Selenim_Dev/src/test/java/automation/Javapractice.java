package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Javapractice {

	public static void main(String[] args) {
		
		System.out.println("Practice");
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.get("https://www.hopscotch.in/");
		WebElement All=
		driver.findElement(By.xpath ("//*[@class='icon-20 icon-sortbar-arrow']"));
		Actions ACT = new Actions(driver);
		ACT.moveToElement (All).perform();
		WebElement Girl=
		driver.findElement(By.xpath("//div[@class='row']//div[@class='sort-scroll']//span[@class='sort-name ng-binding'][normalize-space()='Girl']"));
		ACT.moveToElement (Girl).perform();
		
		
	
		

	}

}
