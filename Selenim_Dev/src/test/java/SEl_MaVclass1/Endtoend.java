package SEl_MaVclass1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class Endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//open amazon url 
		driver.get("https://www.amazon.in/");
		
		//get title of the page and print in console.
		String titleH = driver.getTitle();
		System.out.println(titleH);
		
		//assigned search bar in search variable.
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		
		//put the item phone in search bar and clicked.
		Search.sendKeys("Phone");
		Search.submit();
		Thread.sleep(5000);
		
		//get the element sign in and assigned it in login variable.
		WebElement login = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//login.click();
		
		//create the action object and assigned it in a variable.
		Actions a =new Actions(driver);
		Thread.sleep(5000);
		
		//mouse courser move on (Hover) sign in element and pop up page will display
		a.moveToElement(login).build().perform(); // mouse hover
		Thread.sleep(5000);
		
		////put the item phone in search bar and scroll horizontally.
		WebElement Search_DC = driver.findElement(By.id("twotabsearchtextbox"));
		Search_DC.sendKeys("Phone");
		a.scrollByAmount(7000, 0);
		
		//Search_DC.submit();
		
		//scroll bar move 4k pixel horizontally and 3k pixel vertically.
		a.scrollByAmount(-4000, 3000);
		a.doubleClick(Search_DC).perform(); //double click
		a.contextClick(Search_DC).perform(); // right click
		
		
		
	}
}