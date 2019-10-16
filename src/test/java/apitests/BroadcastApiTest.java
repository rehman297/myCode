package apitests;

import apitestutils.pages.BroadcastSchedulePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import apitestutils.base.TestBase;
import apitestutils.pages.HomePageUserPortal;
import apitestutils.pages.LoginUserPortalPage;

public class BroadcastApiTest extends TestBase{
	LoginUserPortalPage loginUserPortalPage;
	HomePageUserPortal homePageUserPortal;
	BroadcastSchedulePage oBroadcastSchedulePage;
	
	public BroadcastApiTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		//initialization();
		/*loginUserPortalPage=new LoginUserPortalPage();
		homePageUserPortal=new HomePageUserPortal();*/
		oBroadcastSchedulePage=new BroadcastSchedulePage();
	}
	
	@Test
	public void verifyBroadcastApiData() {
		boolean isResult=false;
		//Assert.assertTrue(loginUserPortalPage.validateLoginPage());
		isResult=oBroadcastSchedulePage.verifyBrScheduleContent();
		//loginUserPortalPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(isResult, "Broadcast schedule API verification failed!!");
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
