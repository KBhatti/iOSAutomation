package TestCases;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AbstractPageSD 
{
	protected static IOSDriver<IOSElement> driver;
	protected static WebDriver wdriver;
	public static String udid;
	
	public String currentFolderPath() 
	{
		return new File(AbstractPageSD.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getAbsolutePath();
	}
	
	protected IOSDriver<IOSElement> getDriver()
	{
		if (driver == null)
		{
			URL serveraddress = null;	
			String value=null;
			String line = null;
			String classpathroot = currentFolderPath();
			File currentFolderPath = new File(classpathroot,"/");
	
			Process proc;
			
			try 
			{
				proc = Runtime.getRuntime().exec(currentFolderPath.getParentFile().getParentFile().getParentFile().toString() + "/GetUDID.sh");
				InputStream stdin = proc.getInputStream();

				InputStreamReader isr = new InputStreamReader(stdin);

				BufferedReader br = new BufferedReader(isr);

				while ((line = br.readLine()) != null)
				{
					value = line;
				}   
				
				udid = "\""+value+"\"";
				//udid = value;
			} 
			catch (IOException e1) 
			{				
				e1.printStackTrace();
			}
			
			//String currentDir = currentFolderPath.getParentFile().getParentFile().getParentFile().toString();
	
			DesiredCapabilities capabilities = new DesiredCapabilities();
			//capabilities.setCapability("automationName", "Appium");
			//capabilities.setCapability("appium-version", "1.4.13"); 
			//capabilities.setCapability("platformName", "iOS"); 
			//capabilities.setCapability("platformVersion", "8.4"); 
			capabilities.setCapability("deviceName", "/(^[a-z ]+$)/i");
			//capabilities.setCapability("app", currentDir + "/Debug-iphoneos/TigerText.app");
			//capabilities.setCapability("app", "/Users/kashifbhatti/IOS_Automation/iOSSmokeTest/Debug-iphoneos/TigerText.app");
			capabilities.setCapability("bundleId", "com.tigertext.tigertext"); 
			capabilities.setCapability("udid", udid.trim());
			System.out.println(udid);
			
			
			try 
			{
				serveraddress = new URL("http://127.0.0.1:4723/wd/hub");
			} 
			catch (MalformedURLException e) 
			{
				
				e.printStackTrace();
			}  
			driver = new IOSDriver<IOSElement>(serveraddress, capabilities);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
		return driver;
	}
	
	
	protected WebDriver getWebDriver()
	{
		if (wdriver == null)
		{
			wdriver = new FirefoxDriver();
			wdriver.manage().window().maximize();
			wdriver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		return wdriver;
	}
	
	
}


