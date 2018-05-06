package com.micollab.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.micollab.qa.base.TestBase;
import com.micollab.qa.pages.HomePageUserPortal;
import com.micollab.qa.pages.LoginUserPortalPage;

public class LoginPageTest extends TestBase{
	LoginUserPortalPage loginUserPortalPage;
	HomePageUserPortal homePageUserPortal; 
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginUserPortalPage=new LoginUserPortalPage();
		homePageUserPortal=new HomePageUserPortal();
	}
	
	@Test
	public void LoginUserPortal() {
		//Assert.assertTrue(loginUserPortalPage.validateLoginPage()); 
		loginUserPortalPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(homePageUserPortal.validateSuccessfulLogin());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
