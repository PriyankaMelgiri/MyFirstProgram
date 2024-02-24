package test_Pages.MyAccount;

import org.testng.annotations.Test;

import DXL.UAT.BaseClass;
import DXL.UAT.Object_repository;

public class Saved_Addresses extends BaseClass {

	Object_repository objRepo;
	@Test
	public void editLink() {
		objRepo=new Object_repository(driver);
	}
}
