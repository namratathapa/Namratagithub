package SEl_MaVclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonasignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver drive;
		System.out.println("Search assignment");
		drive = new FirefoxDriver();
		drive.get("https://www.amazon.in/");
		Thread.sleep(10000);		
		 drive.findElement(By.name("field-keywords")).sendKeys("Mobile");
		 drive.findElement(By.xpath("//*[@clss='nav-search-submit nav-sprite']")).click();
		 	
		
		

	}

}
