package apitestutils.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import apitestutils.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		
		try {
			prop=new Properties();
			String projectDir=System.getProperty("user.dir");
			FileInputStream ip=new FileInputStream(projectDir+"/src/main/java/apitestutils/config/config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:/Software/Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "F:/Software/Driver");
			driver=new FirefoxDriver();
		}
			
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
