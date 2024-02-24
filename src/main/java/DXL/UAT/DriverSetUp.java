package DXL.UAT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetUp {

	WebDriver driver;
	WebDriverWait wait;

	public DriverSetUp(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(30));
	}
	
	public void navigateToURL(String URL) {
		 driver.get(URL);
		 driver.manage().window().maximize();
	}
	
//	public By locator(String locator) {
//		switch(locator) {
//		case "xpath":
//			By.xpath(locator);
//		case "id":
//			By.id(locator);
//		}
//		return null ;
//	}
	
//	public WebElement getElement(String locator) {
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
//		WebElement element=driver.findElement(By.id(locator));
//		return element;
//	}
	public  WebElement getElement(String locator,String locatorType) {
		WebElement element = null;
		By loc=null;
		switch(locatorType) {
		case "xpath":
			 loc=By.xpath(locator);
			 wait.until(ExpectedConditions.presenceOfElementLocated(loc));
			 element=driver.findElement(loc);
			break;
		case "id":
			 loc=By.id(locator);
			 wait.until(ExpectedConditions.presenceOfElementLocated(loc));
			 element=driver.findElement(loc);
			
			break;
		}
		
		return element;
	}
	
	public List<WebElement> getElements(String locator,String locatorType){
		List<WebElement> elements=null;
		By locs=null;
		switch(locatorType) {
		case "xpath":
			locs=By.xpath(locator);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locs));
		    elements=driver.findElements(locs);
			break;
		case "id":
			locs=By.id(locator);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locs));
			 elements=driver.findElements(locs);
		}
		return elements;
	}
	
}
