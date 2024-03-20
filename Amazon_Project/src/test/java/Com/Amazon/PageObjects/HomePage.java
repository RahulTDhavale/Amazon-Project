package Com.Amazon.PageObjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Amazon.Utilities.Baseclass;




public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
	WebElement logo_amazon;
	
	@FindBy(xpath="//*[@id=\"nav-global-location-popover-link\"]")
	WebElement ele_location;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]")
	WebElement ele_All_InputTXT_Search;
	
	@FindBy(xpath="//*[@id=\"nav-search-dropdown-card\"]/div")
	WebElement dropdown_All;
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement txt_search;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement btn_search;
	
	@FindBy(xpath="//*[@id=\"icp-nav-flyout\"]")
	WebElement dropdown_lang;
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement WebEle_Accounts_Lists;
	
	@FindBy(xpath="//*[@id=\"nav-orders\"]")
	WebElement WebEle_returnOrder;
	
	@FindBy(xpath="//*[@id=\"nav-cart\"]")
	WebElement logo_Cart;
	
	public void check_Logo_Presence() {
		if(logo_amazon.isDisplayed()) {
			System.out.println("Logo is present");
		}else {
			System.out.println("Logo is not present");
		}
	}
	
	public void Check_Attribute_Link(String Link) {
		
		String actualLink = logo_amazon.getAttribute("href");
		
		Assert.assertEquals(actualLink, Link);
		
		System.out.println("Link is correct");
			   
	}
	
	public void setTexttoSearchbar(String Text) {
		
		txt_search.sendKeys(Text);
	}
	
	public void clickSearchBTn() {
		
		btn_search.click();
	}
	
	
	

}
