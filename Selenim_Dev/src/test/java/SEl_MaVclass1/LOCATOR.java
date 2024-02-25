package SEl_MaVclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LOCATOR {

		public static void main(String[] args) {
			WebDriver driver;
		System.out.println("Browser & URL open program");
	
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement Namy =driver.findElement(By.id("twotabsearchtextbox"));
		Namy.sendKeys("shirt");
			
		Namy.sendKeys("Black Pants");
		
		WebElement Namy1 =driver.findElement(By.id("nav-search-submit-button"));
		Namy1.click();
		
		//driver.close();

	}

}
