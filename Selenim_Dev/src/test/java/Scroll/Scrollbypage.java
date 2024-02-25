package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollbypage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;



		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);

		//This will scroll the web page till end.		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


	}

}
