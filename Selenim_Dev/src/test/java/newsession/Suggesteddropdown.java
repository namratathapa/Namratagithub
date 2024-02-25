package newsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Suggesteddropdown {

	
		public static void main(String[] args) throws InterruptedException {


			System.out.println("Hello world!");
			System.out.println("start selenium Projects");
			WebDriver driver ;			
		
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("python");
			Thread.sleep(5000);
			//List<WebElement> suggestion_list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
			List<WebElement> suggestion_list = driver.findElements(By.xpath("//div[@id='Alh6id']/div//div/ul/li"));
			
			
			
			int a = suggestion_list.size();
			System.out.println(a);
			//System.out.println(suggestion_list.size());
			//System.out.println(suggestion_list.size());
		
			for (WebElement Suggestion_name : suggestion_list) {
				
				String suggestion_value = Suggestion_name.getText();
				
				System.out.println(suggestion_value);
				// compare required suggestions
				if (suggestion_value.equalsIgnoreCase("python online")) {
					Thread.sleep(5000);
					Suggestion_name.click();

				}}
			System.out.println("element not found");

	}

}
