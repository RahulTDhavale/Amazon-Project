package Com.Amazon.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.Amazon.Utilities.Baseclass;


public class SignInPage {


	public WebDriver driver;
	public SignInPage(WebDriver driver) {
		
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div/a")
	WebElement img_logo;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement txt_emailor_phone;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement btn_continue;
	
	public boolean CheckLogoPresence(){
		boolean status = img_logo.isDisplayed();
		return status;
	}
	
	public void setEmailOrPhone(String Email){
		txt_emailor_phone.sendKeys(Email);
	}
	
	public void clickContinue() {
		btn_continue.click();
	}
	
	
    
    

}
