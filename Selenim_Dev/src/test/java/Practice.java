import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	
	    public static void main(String[] args) throws InterruptedException {
	        System.out.println("start selenium Drag & Drop Projects");
	      
	        WebDriver driver = new FirefoxDriver();
	       
	        driver.get("https://jqueryui.com/droppable/");

	        //  switch into frame
	        WebElement framedrop = driver.findElement(By.tagName("iframe"));
	        driver.switchTo().frame(framedrop);

	        WebElement drag = driver.findElement(By.id("draggable"));
	        WebElement drop = driver.findElement(By.id("droppable"));
	        Thread.sleep(2000);
	        Actions ACT = new Actions(driver);
	        //ACT.dragAndDrop(drag,drop).build().perform();
	        ACT.dragAndDrop(drag,drop).perform();
	        Thread.sleep(2000);
	        //driver.close();

	        // WebElement element = driver.findElement(By.id("draggable"));

		

	}

}
