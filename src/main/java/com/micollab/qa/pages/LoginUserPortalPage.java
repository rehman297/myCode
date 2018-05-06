package com.micollab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.micollab.qa.base.TestBase;

public class LoginUserPortalPage extends TestBase{
	
	
	//page factory-OR(object repository)
	
	@FindBy(xpath="//div[@class='middleColumn']//div[@class='row']//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//div[@class='middleColumn']//div[@class='row']//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement loginBtn;
	
	public LoginUserPortalPage() {

		PageFactory.initElements(driver, this);
	}

	public boolean validateLoginPage() {
		String title= driver.getTitle();
		System.out.print(title);
		return title.equals(prop.getProperty("pageTitle"));

	}

	public HomePageUserPortal login(String un, String pwd) {
		
		try {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new HomePageUserPortal();
	}

}

