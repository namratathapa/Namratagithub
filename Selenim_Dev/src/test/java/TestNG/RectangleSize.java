package TestNG;



import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

public class RectangleSize{
	
	public static  void main(String[] args) {
		
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage(). timeouts(). implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().window().fullscreen();// use this line one by one and check location
		driver.manage().window().maximize();// use this line one by one and check location & run without this both manage syntexes.

		driver.get("https://app.hubspot.com/login"); 
	

		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		// selenium 3:

		Dimension loginButtonDim = loginButton.getSize();
		System. out.println(loginButtonDim. getHeight());
		System. out.println(loginButtonDim. getWidth());
		System.out.println("_---------------------------------------------------------------------------");

		Point p = loginButton.getLocation();
		System. out.println(p.getX());
		System. out.println(p.getY());
		System.out.println("_---------------------------------------------------------------------------");
		//selenium 4:
		Rectangle loginButtonRect = loginButton.getRect();

		System.out.println(loginButtonRect.getHeight());
		System. out.println(loginButtonRect.getWidth());
		System.out.println("_---------------------------------------------------------------------------");
		System.out.println(loginButtonRect.getX());
		System.out.println(loginButtonRect.getY());

		
		
		

	}
}



