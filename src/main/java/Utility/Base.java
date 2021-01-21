package Utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class Base {

	ConfigurationRead congiguration_Read = new ConfigurationRead();
	
	public String BaseUrl = congiguration_Read.getBaseUrl();
	public String ChromeBrowser = congiguration_Read.getChromeBrowser();
	public String Browser = congiguration_Read.getBrowser();
	public static WebDriver Driver;
	public JavascriptExecutor js;
	
	@BeforeTest
	public void setup()
	{	
		if(Browser.contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ChromeBrowser);
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
			ChromeOptions chromeOption = new ChromeOptions();
			chromeOption.merge(capability);
			
			Driver = new ChromeDriver();
		}
		else
			System.out.println("Driver is not created");
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Integer.parseInt(congiguration_Read.getTimeLimit()), TimeUnit.SECONDS);
		Driver.get(BaseUrl);
		
	}
	
	//@AfterTest
	public void End() 
	{
		Driver.quit();
	}
	
	public static void captureScreen(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) Driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(path);
		
		FileUtils.copyFile(source, target);
	}
	
}
