package SEl_MaVclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxassignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver checkbox;
		System.out.println("Checkbox assignment");
	
		WebDriverManager.firefoxdriver().setup();
		checkbox = new FirefoxDriver();
		checkbox.get("https://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(5000);
		
		  // Wait for the page to load (recommended to use explicit waits instead)
        Thread.sleep(5000);

        // Find the first checkbox element
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        // Check if the checkbox is already checked
        if (checkbox1.isSelected()) {
            // If it is checked, click on it again to uncheck	
            checkbox1.click();
        }

        // Wait for a moment (recommended to use explicit waits instead)
        Thread.sleep(5000);

        // Find the second checkbox element
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        // Check if the checkbox is already checked
        if (checkbox2.isSelected()) {
            // If it is checked, click on it again to uncheck
            checkbox2.click();
        }

        // Wait for a moment (recommended to use explicit waits instead)
        Thread.sleep(5000);

        // Close the browser
		
	}

}
