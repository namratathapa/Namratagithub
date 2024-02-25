package SEl_MaVclass1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TitleH {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver = new EdgeDriver();
			//driver.manage().window().maximize();
			//driver.manage().window().minimize();
			driver.get("https://www.amazon.in/");
			String titleH = driver.getTitle();
			System.out.println(titleH);
			WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
			Search.sendKeys("Phone");
			Search.submit();
			Thread.sleep(5000);
			WebElement login = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
			//login.click();
			//Actions a =new Actions(driver);
			Actions a =new Actions(driver);
			a.moveToElement(login).build().perform(); // mouse hover
			Thread.sleep(5000);
			WebElement Search_DC = driver.findElement(By.id("twotabsearchtextbox"));
			Search_DC.sendKeys("Phone");
			a.scrollByAmount(7000, 0);
			
			//Search_DC.submit();
			a.scrollByAmount(-4000, 3000);
			a.doubleClick(Search_DC).perform(); //double click
			a.contextClick(Search_DC).perform(); // right click
			
			
			
		}
	

	}


