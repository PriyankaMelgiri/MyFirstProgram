package actions_Page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import element_Locator.Guest_SignIn_Locator;
/**guest Action **/
//guestActionss
//guestsactionssss
public class Guest_Sign_Action {

	Guest_SignIn_Locator guestSignIn;
	WebDriver driver;
	
	public Guest_Sign_Action(WebDriver driver){
		this.driver=driver;
		guestSignIn=new Guest_SignIn_Locator(this.driver);
	}
	
	public void guestIconClick() {
		guestSignIn.guestIcon.click();
	}
	
	public void signInbutton() {
		guestSignIn.signInButton.click();
	}

	public void emailField() {
		guestSignIn.emailField.sendKeys("april@yopmail.com");
	}

	public void passwordField() {
		guestSignIn.passwordField.sendKeys("approve1");
	}

	public void signInUser() {
		guestSignIn.signInUser.click();
	}
	
	public int add()
	{
		return 10;
	}
	
}
