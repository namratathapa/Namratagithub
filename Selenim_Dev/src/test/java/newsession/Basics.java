package newsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		//Get Title
		
		String title= driver.getTitle();
		System.out.println(title);

		
		//Get Page id
		
				String pageid = driver.getWindowHandle();
				System.out.println(pageid);
				
				
				//Get Page URL
				
				String URL = driver.getCurrentUrl();
				System.out.println(URL);
				
				WebElement shopping=
						driver.findElement (By.xpath("//*[@class='Pke_EE']"));
						shopping.sendKeys("Saree");
						shopping.sendKeys(Keys.ENTER);
						
						//Get Title
						
						String titl1= driver.getTitle();
						System.out.println(titl1);

						
						//Get Page id
						
								String pageid1 = driver.getWindowHandle();
								System.out.println(pageid1);
								
								
								//Get Page URL
								
								String URL1 = driver.getCurrentUrl();
								System.out.println(URL1);
								
								//WebElement shopping1=


	}

}
