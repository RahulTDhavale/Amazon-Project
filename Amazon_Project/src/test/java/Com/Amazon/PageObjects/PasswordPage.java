package Com.Amazon.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Amazon.Utilities.Baseclass;

public class PasswordPage {
	
	public WebDriver driver;
	public PasswordPage(WebDriver driver) {
		
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement txt_password;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement btn_signIn;
	
	public void setPassword(String password) {
		
		txt_password.sendKeys(password);
	}
	
    public void clickSignIn() {
		
		btn_signIn.click();
    }
}
