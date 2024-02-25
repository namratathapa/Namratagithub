package newsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo {

	/*public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();*/
	
	public static void main(String[]args) throws InterruptedException {
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(5000);
	driver.get("https://web.whatsapp.com/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	
	
		
		
		
		
	}

}
