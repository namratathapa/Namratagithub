package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbypixel {

	private static final Object Element = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;



		driver = new ChromeDriver();
		// driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application		
		driver.get("https://web.cdslindia.com/");

		//To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		// This  will scroll down the page by  1000 pixel vertical		
		/*js.executeScript("window.scrollBy(0,200)");*/
		
		 //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
    
	}

}
