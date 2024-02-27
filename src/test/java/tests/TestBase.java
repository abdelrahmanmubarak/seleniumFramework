package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.Helper;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class TestBase {
	public static WebDriver driver;

	@BeforeSuite
	@Parameters ({"browser"})
	public void startDriver(@Optional("chrome") String browserName){
		if (browserName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("safari")){
			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://demo.nopcommerce.com/");

	}

	//@AfterSuite
	//public  void closeDriver(){
		//driver.quit();

	// Take a screenshot when the test method fails and add it in screenshots Folder

}

