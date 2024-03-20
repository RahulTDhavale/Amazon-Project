package Com.Amazon.Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
	
	public static WebDriver driver;
	
	public String url ="https://www.amazon.in/";
	
	@BeforeMethod
	public void invokeBrowser() {
		
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	 public void closeBrowser() {
		
		driver.quit();
	}
	

}
