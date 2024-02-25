package SEl_MaVclass1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
			
		System.out.println("Window Handler");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();// Parents
		System.out.println("parent window Id is -->" + parentHandle);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.id("newWindowBtn")).click();
		/* if open multiple windows, 
		 by default we are on parent window page. this title will proved this 
		 */
		System.out.println("child window title is-->"+driver.getTitle());
		 Set<String> handles = driver.getWindowHandles();//More than one I'd so its like a work in Array
		 System.out.println("******");
	 System.out.println(handles);
	 System.out.println("******");
	for (String handle : handles)
	{
	System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				System.out.println("child window");
			driver.manage().window().maximize();
				String title1 =driver.getTitle();//
				System.out.println("Childpageid==" +title1);
				driver.findElement(By.id("firstName")).sendKeys("yadagiri");
			Thread.sleep (5000) ;
			System.out.println("**end child win**");
				driver.close();
				}
	else {
		System.out.println("terminate***");
	}
	}
				driver.switchTo().window(parentHandle);
	driver.findElement (By.id("name")).sendKeys ("Reddy");		
		 Thread.sleep(2000);
			//driver.quit(); 
			System.out.println("Window Handler");
			WebDriverManager.firefoxdriver().setup();//id change work of handler;;;;
			WebDriver driver1 = new EdgeDriver();
			driver1.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver1.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			//String parentHandle1 = driver.getWindowHandle();// Parents
			System.out.println("parent window Id is -->" + parentHandle);
	    
	        // Set the path to the ChromeDriver executable
	    	
	    }
	
	}


