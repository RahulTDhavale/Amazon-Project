package Com.Amazon.TestCases;

import org.testng.annotations.Test;

import Com.Amazon.PageObjects.HomePage;
import Com.Amazon.Utilities.Baseclass;

public class HomePage_UI_Validation extends Baseclass{
	
	HomePage HM;
	
	@Test
	public void LogoTest() {
		
		HM = new HomePage(driver); 
		
		HM.check_Logo_Presence();
		
		HM.Check_Attribute_Link("https://www.amazon.in/ref=nav_logo");
		
		
	}
	

}
