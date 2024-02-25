package SEl_MaVclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//form[@id='gh-f']/table/tbody/tr/td/div/div/input[1]")).sendKeys("watches");
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
		

	}

}
