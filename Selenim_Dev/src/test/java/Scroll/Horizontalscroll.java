package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontalscroll {

	public static void main(String[] args) {
		WebDriver driver;



		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		//initialize java script
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

		WebElement scrollvB = driver.findElement(By.linkText("VBScript"));

		//This will scroll the page Horizontally till the element is found		
		js.executeScript("arguments[0].scrollIntoView();", scrollvB);


	}

}
