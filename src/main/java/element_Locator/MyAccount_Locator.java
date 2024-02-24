package element_Locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DXL.UAT.DriverSetUp;

public class MyAccount_Locator {
	
	WebDriver driver;
	DriverSetUp dSetUp;

	private WebElement myProfileHeading;
	private WebElement myAddressLink;
	//public WebElement myAddressHeading;
	private List<WebElement> addressDetail;
	
	
	
public MyAccount_Locator(WebDriver driver)
{
	this.driver=driver;
	dSetUp=new DriverSetUp(this.driver);
	PageFactory.initElements(this.driver, this);
}

public WebElement getmyProfileHeading()
{
return myProfileHeading=dSetUp.getElement("//b[@label='My Profile']","xpath");
}

//Saved Addresses locators
public WebElement getmyAddressLink()
{
return myAddressLink=dSetUp.getElement("//a[text()='Saved Addresses']", "xpath");
}
public WebElement getmyAddressHeading()
{
WebElement myAddressHeading=dSetUp.getElement("//b[text()='Saved Addresses']", "xpath");
return myAddressHeading;
}
public List<WebElement> getAddressDetail(){
	addressDetail=dSetUp.getElements("//ul//li//p[2]", "xpath");
	return addressDetail;
}

@FindBy (xpath="//a[text()='Edit']") public List<WebElement> editLinks;

}

