import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	public static void main(String[] args) {
		webdriver driver;
		System.out.println("Locator")
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

}
