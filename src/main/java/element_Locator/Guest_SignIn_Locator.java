package element_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guest_SignIn_Locator {

	WebDriver driver;
	
	@FindBy (xpath="//div[text()='Hi Guest']") public WebElement guestIcon;
	
	@FindBy (xpath="//div[contains(@class,'mat-menu-content')]//button[text()='Sign In'] | //*[contains(@class,'mat-drawer-opened')]//button[text()='Sign In']") public WebElement signInButton;
	
	@FindBy (id="email") public WebElement emailField;
	
	@FindBy (id="password") public WebElement passwordField;
	
	@FindBy (xpath="//button[text()='SIGN IN']") public WebElement signInUser;
	
	@FindBy (xpath="//a[@title='My Account']//div[contains(.,'Hi')]") public WebElement HiUserName;

	@FindBy (xpath="//i[contains(@class,'dxlicon-user')]") public WebElement dxlicon;
	
	@FindBy (xpath="//div[contains(@class,'mat-drawer-inner-container')]//a[text()='My Profile'] | //div[contains(@class,'mat-menu-content')]//a[text()='My Account'] | //div[contains(@class,'ng-star-inserted')]//a[text()='My Account']") public WebElement myAccountLink;
	
	public Guest_SignIn_Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
