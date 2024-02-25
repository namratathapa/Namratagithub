package SEl_MaVclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Mav_Class1 {
	@Test
	public  void firefox() {
		// TODO Auto-generated method stub
		System.out.println("Hello");	
		// TODO Auto-generated method stub
		WebDriver driver ;
	    System.out.println("Hello");
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver(); 
	     driver.manage().window().maximize();
	     driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.1");
	}
	@Test
	public  void chrome() {
		WebDriver driver;
	     WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver(); 
		     driver.manage().window().maximize();
		     driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.1");
	}

}
