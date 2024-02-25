package SEl_MaVclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.out.println("Hello");
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver(); 
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	   //driver.findElement(By.xpath("//*[@class ='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
			driver.findElement(By.name("q")).sendKeys("Mobile");
			Thread.sleep(4000);
driver.findElement(By.xpath("//*[@class='L0Z3Pu']")).click();
			
			driver.close();
	}
	}


