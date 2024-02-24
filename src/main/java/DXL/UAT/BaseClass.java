package DXL.UAT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import actions_Page.HomePage_Action;
import element_Locator.HomePage_Locators;

public class BaseClass {

	public WebDriver driver;
	Object_repository objectRepo;
     WebDriverWait wait;
	@Parameters({"browser","URL"})
	@BeforeClass
	public void launchSite(@Optional ("chrome") String browserName,@Optional ("https://uat.gamma.destinationxl.com")String url) {
//		if(browserName.equals("chrome")) {
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("headless");
//			
//		driver=new ChromeDriver();}
//		else if(browserName.equals("Firefox")){
//			driver=new FirefoxDriver();
//		}
//		else if(browserName.equals("edge")) {
//			driver=new EdgeDriver();
//		}
		switch(browserName) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "Firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		}	
		 wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	 objectRepo=new Object_repository(driver);
		 objectRepo.driverSetUp.navigateToURL(url);	

		WebElement cookie= objectRepo.driverSetUp.getElement("onetrust-accept-btn-handler","id");
		wait.until(ExpectedConditions.elementToBeClickable(cookie));
		cookie.click();
		WebElement internationalCloseIcon=objectRepo.driverSetUp.getElement("closeButton","id");
		wait.until(ExpectedConditions.elementToBeClickable(internationalCloseIcon));
		internationalCloseIcon.click();	
	}
	
	@Test @Ignore
	public void validateDXLTitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "DXL - Shop for Big & Tall Men's Clothing & Accessories");
	}
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
	
	public void click(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void sendKeys(WebElement element,String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(text);
	}
}
