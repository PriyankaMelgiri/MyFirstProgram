package test_Pages.MyAccount;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import DXL.UAT.BaseClass;
import DXL.UAT.Object_repository;

public class Saved_Addresses extends Sign_In {
	
	@Test(priority=1)
	public void myAddress() {
		click(objRepo.myaccountLocator.getmyAddressLink());
		WebElement savedAddressHeading=objRepo.myaccountLocator.getmyAddressHeading();
		String savedAddressHeadingValidation=savedAddressHeading.getText();
	Assert.assertEquals(savedAddressHeadingValidation, "Saved Addresses");
	}
	@Test(priority=2)
	public void editAddress() {
		for(WebElement editLink:objRepo.myaccountLocator.editLinks) {
			click(editLink);
			break;
		}
		for(WebElement state:objRepo.myaccountLocator.statesList) {
			if(!state.getText().equals(objRepo.myaccountLocator.selectedState.getText())) {
			click(state);
			break;
		}}
		click(objRepo.myaccountLocator.updateAddressButton);
	}
	
	@Test
	public void deleteAddress() {
		for(WebElement deleteLink:objRepo.myaccountLocator.deleteLinks) {
			click(deleteLink);
			break;
		}
	}
	
}
