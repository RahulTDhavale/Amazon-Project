package Com.Amazon.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Amazon.PageObjects.PasswordPage;
import Com.Amazon.PageObjects.SignInPage;
import Com.Amazon.Utilities.Baseclass;

public class LoginTest extends Baseclass {
	
	 
     public SignInPage sp;
     
     public PasswordPage pwp;
     
//    public String url ="https://www.amazon.in/";
//     
//     @BeforeClass
// 	public void invokeBrowser() {
// 		
// 		
// 		driver = new ChromeDriver();
// 		driver.get(url);
// 		driver.manage().window().maximize();
// 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// 		
// 	}
// 	
// 	@AfterClass
// 	 public void closeBrowser() {
// 		
// 		driver.quit();
// 	}
     
     @Test(priority = 0)
     public void SC01_TC01() {
    	 
    	 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
    	 
    	 
    	 sp = new SignInPage(driver);
    	 sp.setEmailOrPhone("8698884442");
    	 sp.clickContinue();
    	 
    	 pwp = new PasswordPage(driver);
    	 pwp.setPassword("Amazon@1010");
    	 pwp.clickSignIn();
    	 
     }
     
     @Test(priority = 1)
         public void SC01_TC02() {
    	 
    	 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
    	 
    	 
    	 sp = new SignInPage(driver);
    	 sp.setEmailOrPhone("86988844421");
    	 sp.clickContinue();
    	 
    	 pwp = new PasswordPage(driver);
    	 pwp.setPassword("Amazon@1010");
    	 pwp.clickSignIn();
     
}
     
     @Test(priority = 2)
     public void SC01_TC03() {
	 
	 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	 
	 
	 sp = new SignInPage(driver);
	 sp.setEmailOrPhone("8698884442");
	 sp.clickContinue();
	 
	 pwp = new PasswordPage(driver);
	 pwp.setPassword("Amazon#1010");
	 pwp.clickSignIn();
}
     
     @Test(priority = 4)
     public void SC01_TC04() {
    	 
    	 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
    	 
    	 
    	 sp = new SignInPage(driver);
    	 sp.setEmailOrPhone("86988844421");
    	 sp.clickContinue();
    	 
    	 pwp = new PasswordPage(driver);
    	 pwp.setPassword("Amazon#1010");
    	 pwp.clickSignIn();
    }
}