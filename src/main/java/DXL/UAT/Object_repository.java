package DXL.UAT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions_Page.Guest_Sign_Action;
import element_Locator.Guest_SignIn_Locator;
import element_Locator.HomePage_Locators;
import element_Locator.MyAccount_Locator;


public class Object_repository {

	WebDriver driver;
	public DriverSetUp driverSetUp;
	public HomePage_Locators homepagelocator;
	public Guest_SignIn_Locator guestSignInLocator;
	public Guest_Sign_Action guestSignInAction;
	public MyAccount_Locator myaccountLocator;
	
	public Object_repository(WebDriver driver) {
		this.driver=driver;
		driverSetUp=new DriverSetUp(this.driver);
		guestSignInLocator=new Guest_SignIn_Locator(this.driver);
		guestSignInAction=new Guest_Sign_Action(this.driver);
		myaccountLocator=new MyAccount_Locator(this.driver);
		
	}
}
