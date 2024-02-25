package SEl_MaVclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("Browser & URL open program");
	
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");


        // uncheck both checkboxes
        WebElement chek1 = driver.findElement(By.xpath("//input[@type ='checkbox'][1]"));
        chek1.click();
        Thread.sleep(7000);
       /* WebElement chek2 = driver.findElement(By.xpath("//input[@type ='checkbox'][2]"));
        chek2.click();
        Thread.sleep(5000);*/

        // checked both check boxes
        WebElement chek4 = driver.findElement(By.xpath("//input[@type ='checkbox'][1]"));
        chek1.click();
        Thread.sleep(7000);
        WebElement chek3 = driver.findElement(By.xpath("//input[@type ='checkbox'][2]"));
        chek3.click();
        Thread.sleep(5000);

        driver.close();

	}

}
