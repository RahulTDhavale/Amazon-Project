package Com.Amazon.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Amazon.PageObjects.HomePage;
import Com.Amazon.Utilities.Baseclass;

public class ValidateSearchFunctionality extends Baseclass{
	
	public HomePage hp;
	
	@Test
	public void validateSearchBar1() {
		
		hp = new HomePage(driver);
		hp.setTexttoSearchbar("mobile phone");
		hp.clickSearchBTn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String text=driver.findElement(By.xpath("//*[@id=\"n-title\"]")).getText();
		Assert.assertEquals(text, "Category");
		
	}
	
	@Test
	public void ValidateSearchBar2() {
		
		hp=new HomePage(driver);
		hp.setTexttoSearchbar("Gaming Laptop");
		hp.clickSearchBTn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        String text=driver.findElement(By.xpath("//*[@id=\"n-title\"]")).getText();
        Assert.assertEquals(text,"Category");
	}

}
