package com.micollab.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.micollab.qa.base.TestBase;;

public class HomePageUserPortal extends TestBase{
	
	//page factory-OR(object repository)
	
		@FindBy(xpath="//td[@class='nav1_home_on']//a[text()='Home']")
		WebElement homeTab;
		
		@FindBy(xpath="//td[starts-with(@class,'nav1_sched_')]//a[text()='Set Up a Conference']")
		WebElement setupAConferenceTab;
		
		
		public HomePageUserPortal() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean validateSuccessfulLogin() {
			return homeTab.isDisplayed();
		}

}
