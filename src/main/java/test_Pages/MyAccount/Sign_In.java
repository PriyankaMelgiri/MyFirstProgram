package test_Pages.MyAccount;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import DXL.UAT.BaseClass;
import DXL.UAT.Object_repository;

public class Sign_In extends BaseClass{

	Object_repository objRepo;
	WebDriverWait wait;
	
	@Test
	public void signin() {
		objRepo=new Object_repository(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		click(objRepo.guestSignInLocator.guestIcon);
		click(objRepo.guestSignInLocator.signInButton);
		sendKeys(objRepo.guestSignInLocator.emailField,"april@yopmail.com");
		sendKeys(objRepo.guestSignInLocator.passwordField,"approve1");
		click(objRepo.guestSignInLocator.signInUser);
		objRepo.guestSignInLocator.HiUserName.isDisplayed();
	
	}
	
	@Test(dependsOnMethods="signin")
	public void myAccountLink() {
		WebElement dxlIcon=objRepo.guestSignInLocator.dxlicon;
		wait.until(ExpectedConditions.elementToBeClickable(dxlIcon));
		click(objRepo.guestSignInLocator.dxlicon);
		click(objRepo.guestSignInLocator.myAccountLink);
	
	WebElement myProfileHeading=objRepo.myaccountLocator.getmyProfileHeading();
	Assert.assertEquals(myProfileHeading.getText(), "My Profile");
	}
	
	@Test(dependsOnMethods= {"signin","myAccountLink"})
	public void myAddress() {
		click(objRepo.myaccountLocator.getmyAddressLink());
		WebElement savedAddressHeading=objRepo.myaccountLocator.getmyAddressHeading();
		String savedAddressHeadingValidation=savedAddressHeading.getText();
	Assert.assertEquals(savedAddressHeadingValidation, "Saved Addresses");
	}
	
	
}
