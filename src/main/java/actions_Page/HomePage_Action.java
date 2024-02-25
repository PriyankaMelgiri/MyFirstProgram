package actions_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import element_Locator.HomePage_Locators;

public class HomePage_Action {

	WebDriver driver;
	HomePage_Locators homepagelocator;
	
	public HomePage_Action(WebDriver driver){
		this.driver=driver;
		homepagelocator=new HomePage_Locators(this.driver);
	}
	public void acceptCookie() {
		homepagelocator.cookieAcceptButton.click();
	}
	//added testing comment
	 public void internationalCloseIcon()  {  
		 homepagelocator.internationalCloseIcon.click();
	 }
	

}
