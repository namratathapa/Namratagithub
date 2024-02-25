package SEl_MaVclass1;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_HR {

	public static void main(String[] args) {
		WebDriver driver;
		System.out.println("Orange_HR");
		
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		System.out.println(driver.getTitle());
		WebElement email=driver.findElement(By.name("EmailHomePage"));
		email.sendKeys("namratathaapa@gmail.com");
		driver.findElement(By.name("action_request")).click();
		driver.findElement(By.name("Name")).sendKeys("Namrata Thapa");
		driver.findElement(By.name("Contact")).sendKeys("9971993410");
		driver.findElement(By.name("Country")).sendKeys("India");
		System.out.println(driver.getTitle());
		
//			if(!handles.equals(parentHandle)) {
//				driver.switchTo().window(handles);
//		
		
		
	}

}
