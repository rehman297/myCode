package apitestutils.util;

import apitestutils.base.TestBase;
import org.openqa.selenium.WebDriver;


/*
 * This class contains all the reusable helper methods to perform different actions or verifications with web or android drivers
 */
public class CommonFunctions extends TestBase {

	
	
	
	
	/**
	 * @param driver
	 * @param url
	 * @return true/false
	 * @description function to launch Moengage dashboard URL on web and login to the same
	 */
	public boolean launchUrl(WebDriver driver, String url){

		boolean isUserLoggedIn=true;
		try {
			
			driver.get(url);
			isUserLoggedIn=true;
		} catch (Exception e) {
			isUserLoggedIn=false;
			// TODO: handle exception
		}
		return isUserLoggedIn;

	}

	//Overloaded method of clickElement(): Function to click a UI element with dynamic wait
//	public boolean clickElement(String locator, TestUtil.LocatorType locatorType, int timeOutInSsec){
//
//		boolean isElementClicked=true;
//		WebDriverWait wait = null;
//		try {
//
//			wait=new WebDriverWait(androidDriver, timeOutInSsec);
//			switch(locatorType){
//				case xpath:
//					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
//					Thread.sleep(1500);
//					androidDriver.findElementByXPath(locator).click();
//					break;
//				case id:
//					wait.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
//					Thread.sleep(5000);
//					androidDriver.findElementById(locator).click();
//					break;
//				case classname:
//					wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
//					Thread.sleep(1500);
//					androidDriver.findElementByClassName(locator).click();
//					break;
//			}
//
//		} catch (Exception e) {
//			isElementClicked=false;
//			e.printStackTrace();
//		}
//		return isElementClicked;
//
//	}


}
