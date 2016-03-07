package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.settingsPO;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class CommonPageSD extends AbstractPageSD
{
	IOSDriver<IOSElement> driver = getDriver();
	WebDriver wdriver = getWebDriver();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	

	@Given("^I login to the TT app with \"([^\"]*)\"$")
	public void i_login_to_the_TT_app_with(String username) throws Throwable 
	{
		driver.findElement(By.name("Email or Username")).sendKeys(username);
		driver.findElement(By.name("Start")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Enter password"))).sendKeys("Testpass1");
		driver.findElement(By.name("Login")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Activate This Device"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("sendButton"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Start Messaging"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Allow Notifications"))).click();
	}
	
	@Then("^I login to the TT app  with \"([^\"]*)\"$")
	public void i_login_to_TT_app_with(String username) throws Throwable 
	{
		driver.findElement(By.name("Email or Username")).sendKeys(username);
		driver.findElement(By.name("Start")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Enter password"))).sendKeys("Testpass1");
		driver.findElement(By.name("Login")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Activate This Device"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("sendButton"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Start Messaging"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Allow Notifications"))).click();
	}
	
	@Given("^I login to the TT app with Free Org user$")	
	public void then_I_login_to_the_TT_app_with_Free_Org_user() throws Throwable 
	{
		driver.findElement(By.name("Email or Username")).sendKeys("Tee1.User1@tigertext.com");
		driver.findElement(By.name("Start")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Enter password"))).sendKeys("Testpass1");
		driver.findElement(By.name("Login")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Activate This Device"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("sendButton"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Start Messaging"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Allow Notifications"))).click();
	}
	
	@Given("^I login to the TT app with phone no\\.$")
	public void i_login_to_the_TT_app_with_phone_no() throws Throwable 
	{
		driver.findElement(By.name("Email or Username")).sendKeys("3106331732");
		driver.findElement(By.name("Start")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Enter password"))).sendKeys("Testpass1");
		driver.findElement(By.name("Login")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Activate This Device"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("sendButton"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Start Messaging"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Allow Notifications"))).click();
	}
	
	@Then("^I log out of the app$")	
	public void i_log_out_of_the_app() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.clickSettings();
		page.loutSettings();
		page.lOutPopup();
	}
	
	@Given("^I log in to the Web and send a message from Web to iOS$")
	public void i_log_in_to_the_Web_and_send_a_message_from_Web_to_iOS() throws Throwable 
	{
		String baseURL = "https://home.tigertext.com/";
		wdriver.get(baseURL);
		
		wdriver.findElement(By.id("userName")).sendKeys("kashif+test1@tigertext.com");
		wdriver.findElement(By.id("password")).sendKeys("password");
		wdriver.findElement(By.cssSelector("html body div.loginWrapper div.col-a div#standardLogin div.buttonCntr input.btn.btn-success.btn-success-red.btn-success-login")).click();
		wdriver.findElement(By.cssSelector("html body div#home_template div.container-fluid div#left div#menuBarCntr div.header.headerCompose div.btnCompose.newConvButton")).click();
		wdriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]/div[2]/div[1]/ul/li/input")).sendKeys("T0 U0");
		wdriver.findElement(By.xpath("/html/body/div[8]/ul/li/ul/li/div/div")).click();
		Thread.sleep(2000);
		wdriver.findElement(By.cssSelector("html body div#home_template div.container-fluid div#left div.mainCntr div.typeCntr div.inputCntr textarea")).sendKeys("whats up");
		wdriver.findElement(By.cssSelector("html body div#home_template div.container-fluid div#left div.mainCntr div.typeCntr div.send input.button")).click();	
		
	}

	@Then("^I log out of the website$")
	public void i_log_out_of_the_website() throws Throwable 
	{
		wdriver.findElement(By.cssSelector("html body div div.navbar div.navbar-inner div.container-fluid div.dropDownEditProfileCntr div.logOutCntr a")).click();
	}

	
	@After
	public void tearDown(Scenario scenario) throws Exception
	{
		try 
		{
            if (scenario.isFailed()) 
            {            	           	
            	String id = scenario.getId();
            	String featureValue = "";
            	
            	if(id!=null)
            	{
            		try
            			{
            				featureValue = id.split(";")[0];
            			}
            		catch(Throwable e)
            			{
            				//IGNORE
            			}
            	}
            	
            	String fileName = "Feature - " + featureValue + "; Scenario - " + scenario.getName();
            	//String fileName = featureValue + "; "+scenario.getName();
            	String randomName = UUID.randomUUID().toString();
            	
	        	File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        	FileUtils.copyFile(screenShotFile, new File("/Users/kashifbhatti/IOS_Automation/iOSSmokeTest/Screenshot/Failed/" + fileName + "_" + randomName + ".png"));
	        		
	        	/*StackTraceElement[] st = new Exception().getStackTrace();
	            String s=" ";
	            if(st!=null)
	            	{
	            		for(StackTraceElement ste:st)
	            			{ 	
	            				s += "\n" + ste.getClassName() + " " + ste.getMethodName();
	            			}
	            	}
	            		
	            System.out.println(s);   */ 		
            	}
		 }     
         
		finally
			{
	    		driver.resetApp();
	    		Thread.sleep(3000);
	        }	
	}       
		
}	
		

	/*@Rule
	public TestRule listen = new TestWatcher()
	{
		@Override
		public void failed(Throwable t, Description description)
		{
			try	
			{
			takeScreenShot(description.getClassName() + "," + description.getMethodName());
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	};
	
	public void takeScreenShot(String name) throws Exception 
	{
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("/Users/kashifbhatti/IOS_Automation" + name + ".png"));
	}*/

