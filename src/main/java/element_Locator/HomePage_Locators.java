package element_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Locators {
	
	WebDriver driver;

	@FindBy (id="onetrust-accept-btn-handler") public WebElement cookieAcceptButton;
	
	@FindBy (id="closeButton") public WebElement internationalCloseIcon;
	
	public HomePage_Locators(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
